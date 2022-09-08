package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Controller{

    public TextField costInput,yearsInput,scarpValueInput,totalUnitsInput,unitsForYearInput;
    public Text DpValueM1,rateM2;
    public Text yearTxt;
    public Text kTxt;

    // public TableColumn yearRBBTbl;
   // public TableColumn CValRBBTbl;
   // public TableColumn DValRBBTbl;
   // public TableView tableRBB;

    private Stage stage;
    private Scene scene;
    private Parent root;
    double cost;
    double scarpValue;
    int years;
    int totalUnits;

    @FXML
    private TableView<Data> tableRBB;

   @FXML
    private TableColumn<Data,Integer> yearRBBTbl;

   @FXML
    private TableColumn<Data,Double> CValRBBTbl;

    @FXML
    private TableColumn<Data,Double> DValRBBTbl;



    @FXML
    private TableView<Data2> tablePUB;

    @FXML
    private TableColumn<Data2,Integer> yearPUBTbl;

    @FXML
    private TableColumn<Data2,Integer> unitsForYearPUBTbl;

    @FXML
    private TableColumn<Data2,Double> DValPUBTbl;


    ObservableList<Data2> List2 = FXCollections.observableArrayList();
    public int k=1;

    public void loadWIn1(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loadWIn2(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loadWIn3(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void back(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void calMethod1(ActionEvent actionEvent) {
        cost=Double.parseDouble(costInput.getText());
        scarpValue=Double.parseDouble(scarpValueInput.getText());
        years=Integer.parseInt(yearsInput.getText());

        double D_perYear=(cost-scarpValue)/years;
        DpValueM1.setText("  " +String.format("%.2f",D_perYear)+" Rs");

    }

    public void calMethod2(ActionEvent actionEvent) {
        cost=Double.parseDouble(costInput.getText());
        scarpValue=Double.parseDouble(scarpValueInput.getText());
        years=Integer.parseInt(yearsInput.getText());
        double rate= (1-Math.pow((scarpValue/cost),(1.0/years)))*100;
       // System.out.println(rate);
        rateM2.setText(""+rate+"%");
        double CValue=cost;
        double DValue;

        ObservableList<Data> List = FXCollections.observableArrayList();
        for (int i = 1; i <= years; i++) {
            DValue=(CValue*rate)/100;
            List. add(new Data(i,(Math.round(CValue*100.0))/100.0,(Math.round(DValue*100.0))/100.0));     //   Math.round(a*100)/100
            CValue=CValue-DValue;
        }
        yearRBBTbl.setCellValueFactory(new PropertyValueFactory<Data,Integer>("year"));
        CValRBBTbl.setCellValueFactory(new PropertyValueFactory<Data,Double>("CValueRBB"));
        DValRBBTbl.setCellValueFactory(new PropertyValueFactory<Data,Double>("DValueRBB"));
        tableRBB.setItems(List);

    }

    public void calMethod3(ActionEvent actionEvent) {
        cost=Double.parseDouble(costInput.getText());
        scarpValue=Double.parseDouble(scarpValueInput.getText());
        years=Integer.parseInt(yearsInput.getText());
        totalUnits=Integer.parseInt(totalUnitsInput.getText());
        int unitsForYear=Integer.parseInt(unitsForYearInput.getText());
        List2. add(new Data2(k,unitsForYear,((cost-scarpValue)/totalUnits)*unitsForYear));

        yearPUBTbl.setCellValueFactory(new PropertyValueFactory<Data2,Integer>("year"));
        unitsForYearPUBTbl.setCellValueFactory(new PropertyValueFactory<Data2,Integer>("unitsForYear"));
        DValPUBTbl.setCellValueFactory(new PropertyValueFactory<Data2,Double>("DValuePUB"));

        tablePUB.setItems(List2);
        unitsForYearInput.clear();
        k++;
        if(k>years){ yearTxt.setVisible(false);unitsForYearInput.setVisible(false); kTxt.setVisible(false); }
        yearTxt.setText("Units for year "+(k));


    }

    public void clear(ActionEvent actionEvent) {


    }


    public void clearM2(ActionEvent actionEvent) {
        cost = 0;
        scarpValue=0;
        years=0;
        costInput.clear();
        scarpValueInput.clear();
        yearsInput.clear();
        rateM2.setText(" ");
        tableRBB.getItems().clear();
    }

    public void clearM1(ActionEvent actionEvent) {
        cost = 0;
        scarpValue=0;
        years=0;
        costInput.clear();
        scarpValueInput.clear();
        yearsInput.clear();
        DpValueM1.setText(" ");
    }

    public void clearM3(ActionEvent actionEvent) {
        cost = 0;
        scarpValue=0;
        years=0;
        k=1;
        costInput.clear();
        scarpValueInput.clear();
        yearsInput.clear();
        totalUnitsInput.clear();
        unitsForYearInput.clear();
        yearTxt.setText("Units for year 1");
        yearTxt.setVisible(true);unitsForYearInput.setVisible(true); kTxt.setVisible(true);
        tablePUB.getItems().clear();

    }
}
