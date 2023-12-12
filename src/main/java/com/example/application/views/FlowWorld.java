package com.example.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@Route("flow-world")
@RolesAllowed("ADMIN")
public class FlowWorld extends VerticalLayout {


  public FlowWorld() {
    add(new H1("Hello Flow World"));
  }
}
