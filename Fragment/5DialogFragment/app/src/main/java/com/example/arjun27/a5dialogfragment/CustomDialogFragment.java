package com.example.arjun27.a5dialogfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomDialogFragment extends DialogFragment {

    public static final String PERSON_KEY = "PERSON_KEY";

    CustomDialogInterface customDialogInterface;
    EditText editText;
    public static CustomDialogFragment newInstance(Person person) {

        Bundle args = new Bundle();
        args.putParcelable(PERSON_KEY,person);
        CustomDialogFragment fragment = new CustomDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        customDialogInterface= (CustomDialogInterface) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_custom, container, false);

         editText = (EditText) view.findViewById(R.id.editText);

        Button button = (Button) view.findViewById(R.id.button);

        Person person =getArguments().getParcelable(PERSON_KEY);
        editText.setText(person.getName());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                saveData();

            }
        });


        return view;
    }

    private void saveData() {

        Person person=new Person();
        person.setName(editText.getText().toString());
        customDialogInterface.onDataEntryComplete(person);
        dismiss();
    }

    public interface CustomDialogInterface{
        public void onDataEntryComplete(Person person);
    }

}
