package org.demo.personal;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

final class ToolWindowWithTabsFactory implements ToolWindowFactory, DumbAware {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        // Create tabs
        CalendarTabContent tab1 = new CalendarTabContent(toolWindow);
        OtherTabContent tab2 = new OtherTabContent("Tab 2 Content");

        // Create content panels for the tabs
        Content tab1Content = ContentFactory.getInstance().createContent(tab1.getContentPanel(), "Tab 1", false);
        Content tab2Content = ContentFactory.getInstance().createContent(tab2.getContent(), "Tab 2", false);

        // Add tabs to the tool window
        toolWindow.getContentManager().addContent(tab1Content);
        toolWindow.getContentManager().addContent(tab2Content);
    }
}
