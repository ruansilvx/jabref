package org.jabref.gui.sharelatex;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import org.jabref.model.sharelatex.ShareLatexProject;

/**
 * Data class
 * @author CS
 *
 */
public class ShareLatexProjectViewModel {

    private final SimpleBooleanProperty active = new SimpleBooleanProperty();
    private final String projectId;
    private final StringProperty projectTitle;
    private final StringProperty owner;
    private final StringProperty lastUpdated;

    public ShareLatexProjectViewModel(ShareLatexProject project) {

        this.projectId = project.getProjectId();
        this.projectTitle = new SimpleStringProperty(project.getProjectTitle());
        this.owner = new SimpleStringProperty(project.getOwner());
        this.lastUpdated = new SimpleStringProperty(project.getLastUpdated());
    }

    public String getProjectId() {
        return projectId;
    }

    public StringProperty getProjectTitle() {
        return projectTitle;
    }

    public StringProperty getOwner() {
        return owner;
    }

    public StringProperty getLastUpdated() {
        return lastUpdated;
    }

    public BooleanProperty isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active.set(active);
    }
}