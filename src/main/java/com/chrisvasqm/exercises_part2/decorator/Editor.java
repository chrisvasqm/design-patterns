package com.chrisvasqm.exercises_part2.decorator;

public class Editor {
    public void openProject(String path) {
        Renderer[] artefacts = {
                new MainArtifact(new Artefact("Main")),
                new Artefact("Demo"),
                new ErrorArtifact(new Artefact("EmailClient")),
                new Artefact("EmailProvider"),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
