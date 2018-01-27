package com.example.android.fragmentsapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DetailFragment extends Fragment {

    private EditText textFirstName, textLastName, textAge;

    FragmentListener mFragmentListener;

    public DetailFragment() {
    }

    public static DetailFragment newInstance(Person person) {

        Bundle args = new Bundle();
        args.putParcelable("PERSON_KEY",person);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
      //  if (!(context instanceof FragmentListener)) throw new AssertionError();
        mFragmentListener = (FragmentListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        textFirstName = (EditText) rootView.findViewById(R.id.textFirstName);
        textLastName = (EditText) rootView.findViewById(R.id.textLastName);
        textAge = (EditText) rootView.findViewById(R.id.textAge);

        Person person=getArguments().getParcelable("PERSON_KEY");
        textFirstName.setText(person.getFirstName());
        textLastName.setText(person.getLastName());
        textAge.setText(person.getAge());

        Button doneButton = (Button) rootView.findViewById(R.id.done_button);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                done();
            }
        });
        return rootView;
    }

    private void done() {
        if (mFragmentListener != null) {
            throw new AssertionError();
        }
        String fn = textFirstName.getText().toString();
        String ln = textLastName.getText().toString();
        int age = Integer.valueOf(textAge.getText().toString());
        Person person=new Person(fn,ln,age);


        mFragmentListener.onFragmentFinish(person);

    }

    public interface FragmentListener {
        public void onFragmentFinish(Person person);
    }

}
