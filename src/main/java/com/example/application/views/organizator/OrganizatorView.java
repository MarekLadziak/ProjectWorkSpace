package com.example.application.views.organizator;

import com.example.application.data.entity.SamplePerson;
import com.example.application.data.service.SamplePersonService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Organizator")
@Route(value = "Organizator", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class OrganizatorView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private Grid multiSelectGrid = new Grid(SamplePerson.class);

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private DateTimePicker dateTimePicker = new DateTimePicker();

    private TextArea textArea = new TextArea();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private DatePicker datePicker = new DatePicker();

    private Select select = new Select();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private Button buttonPrimary = new Button();

    private Button buttonTertiary = new Button();

    public OrganizatorView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        multiSelectGrid.setWidthFull();
        setGridSampleData(multiSelectGrid);
        layoutColumn3.setWidth(null);
        dateTimePicker.setLabel("Data rozpoczęcia");
        textArea.setLabel("Opis");
        textArea.setWidthFull();
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        datePicker.setLabel("Data zakończenia");
        select.setLabel("Miejsce");
        setSelectSampleData(select);
        layoutRow3.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        buttonPrimary.setText("Dodaj");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonTertiary.setText("Usuń");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(multiSelectGrid);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(dateTimePicker);
        layoutColumn3.add(textArea);
        layoutColumn3.add(layoutRow2);
        layoutRow2.add(datePicker);
        layoutRow2.add(select);
        layoutColumn3.add(layoutRow3);
        layoutRow3.add(buttonPrimary);
        layoutRow3.add(buttonTertiary);
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;

    private void setSelectSampleData(Select select) {
        select.setItems("First", "Second");
    }
}
