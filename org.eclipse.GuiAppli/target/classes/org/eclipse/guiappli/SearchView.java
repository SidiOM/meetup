package org.eclipse.guiappli;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.archan.consulting.service.ServiceManager;

public class SearchView extends ViewPart {

  @Override
  public void createPartControl(Composite parent) {
    Text text = new Text(parent, SWT.BORDER);
    String str="";
   // String str= ServiceManager.getServiceManager().getEjbService().sayHello();
    text.setText(str); //"Imagine a fantastic user interface here");
  }

  @Override
  public void setFocus() {
  }
} 

