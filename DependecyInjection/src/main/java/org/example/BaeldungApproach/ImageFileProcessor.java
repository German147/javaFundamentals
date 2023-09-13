package org.example.BaeldungApproach;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ApplicationScoped
public class ImageFileProcessor {
    @Inject
    private ImageFileEditor imageFileEditor;



    public String getTitle(){
        return this.imageFileEditor.editFile("My Title");
    }
}
