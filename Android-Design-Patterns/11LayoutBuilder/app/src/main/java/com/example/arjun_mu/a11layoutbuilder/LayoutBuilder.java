package com.example.arjun_mu.a11layoutbuilder;

import com.example.arjun_mu.a11layoutbuilder.content.SimpleContent;
import com.example.arjun_mu.a11layoutbuilder.header.Headline;
import com.example.arjun_mu.a11layoutbuilder.header.SubHeadline;
import com.example.arjun_mu.a11layoutbuilder.layoutview.LayoutView;
import com.example.arjun_mu.a11layoutbuilder.content.DetailedContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public class LayoutBuilder {

    public List<LayoutView> displayDetailed() {
        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SubHeadline());
        views.add(new DetailedContent());
        return views;
    }
    public List<LayoutView> displaySimple() {
        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SimpleContent());
        return views;
    }
}
