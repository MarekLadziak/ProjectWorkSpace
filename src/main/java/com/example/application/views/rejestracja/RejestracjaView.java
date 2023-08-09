package com.example.application.views.rejestracja;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Rejestracja")
@Route(value = "Rejestracja", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class RejestracjaView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private Icon icon = new Icon();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private TextField textField = new TextField();

    private TextField textField2 = new TextField();

    private EmailField emailField = new EmailField();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private PasswordField passwordField = new PasswordField();

    private PasswordField passwordField2 = new PasswordField();

    private HorizontalLayout layoutRow4 = new HorizontalLayout();

    private Checkbox checkbox = new Checkbox();

    private Button buttonPrimary = new Button();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    public RejestracjaView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidthFull();
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setHeightFull();
        layoutColumn3.setWidth(null);
        layoutColumn2.setWidth(null);
        icon.getElement().setAttribute("icon", "lumo:user");
        layoutRow2.addClassName(Gap.MEDIUM);
        textField.setLabel("Imię");
        textField2.setLabel("Nazwisko");
        emailField.setLabel("Email");
        emailField.setWidthFull();
        layoutRow3.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        passwordField.setLabel("Hasło");
        passwordField2.setLabel("Potwierdź hasło");
        layoutRow4.setWidthFull();
        layoutRow4.addClassName(Gap.MEDIUM);
        checkbox.setLabel("Regulamin");
        buttonPrimary.setText("Zarejestruj");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setHeightFull();
        layoutColumn4.setWidth(null);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn3);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(icon);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(textField);
        layoutRow2.add(textField2);
        layoutColumn2.add(emailField);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(passwordField);
        layoutRow3.add(passwordField2);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(checkbox);
        layoutRow4.add(buttonPrimary);
        layoutRow.add(layoutColumn4);
    }
}
