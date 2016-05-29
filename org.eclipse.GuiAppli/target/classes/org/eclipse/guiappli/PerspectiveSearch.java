package org.eclipse.guiappli;


import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveSearch implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "perspectivesearch";

	public void createInitialLayout(IPageLayout layout) {
		layout.addView("org.eclipse.GuiAppli.searchview", IPageLayout.TOP,
		        IPageLayout.RATIO_MAX, IPageLayout.ID_EDITOR_AREA);
	}
}
