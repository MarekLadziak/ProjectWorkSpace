package com.example.application.views.logowanie;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Logowanie")
@Route(value = "Logowanie", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class LogowanieView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private EmailField emailField = new EmailField();

    private PasswordField passwordField = new PasswordField();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private Button buttonPrimary = new Button();

    private Button buttonTertiary = new Button();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    public LogowanieView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setHeightFull();
        layoutColumn3.setWidth(null);
        layoutColumn2.setWidth(null);
        emailField.setLabel("Email");
        emailField.setWidthFull();
        passwordField.setLabel("Hasło");
        passwordField.setWidthFull();
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        buttonPrimary.setText("Zaloguj");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonTertiary.setText("Zarejestruj");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        layoutRow.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setHeightFull();
        layoutColumn4.setWidth(null);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn3);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(emailField);
        layoutColumn2.add(passwordField);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(buttonPrimary);
        layoutRow2.add(buttonTertiary);
        layoutRow.add(layoutColumn4);
    }
}
