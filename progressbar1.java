package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class progressbar1 extends Application  {


    ProgressBar progressbar1 = new ProgressBar(0);


    ProgressIndicator indicator01= new ProgressIndicator();
    Button btn1 = new Button("25%");
    Button btn2 = new Button("50%");
    Button btn3 = new Button("75%");
    Button btn4 = new Button("100%");

    Button btn5 = new Button("0%");
    Button btn6 = new Button("Disable Events");
    Button btn7 = new Button("Enable Events");

    TextArea textArea = new TextArea (  );

    Label label = new Label ( null );




    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        btn1.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"
        );btn2.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"
        );btn3.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"
        );btn4.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"
        );btn5.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"
        );btn6.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"

        );btn7.setStyle(
                "-fx-border-color: #a17dff;"+
                        "-fx-border-width: 3;"
                        +"-fx-padding: 5"
        );



        textArea.setText ( null );
        textArea.setMaxWidth ( 400 );

        textArea.setStyle (
                "-fx-padding: 10;"
        );
        indicator01.setOpacity(0.90);

        btn5.setOnAction(event -> {
            progressbar1.setProgress(0);
            indicator01.setProgress(0);
            label.getText ();
            label.setText ( "   : 0 %" );
            textArea.setText ( "Progress in 0 %" );

        });

        btn1.setOnAction(event -> {
            progressbar1.setProgress(0.25);
            indicator01.setProgress(0.25);
            label.getText ();
            label.setText ( "   : 25 %" );
            textArea.setText ( "Progress in 25 %" );

        });
        btn2.setOnAction(event -> {
            progressbar1.setProgress(0.50);
            indicator01.setProgress(0.50);
            label.getText ();
            label.setText ( "   : 50 %" );
            textArea.setText ( "Progress in 50 %" );

        });
        btn3.setOnAction(event -> {
            progressbar1.setProgress(0.75);
            indicator01.setProgress(0.75);
            label.getText ();
            label.setText ( "   : 75 %" );
            textArea.setText ( "Progress in 75 %" );

        });
        btn4.setOnAction(event -> {
            progressbar1.setProgress(1);
            indicator01.setProgress(1);
            label.getText ();
            label.setText ( "   : 100 %" );
            textArea.setText ( "Progress in 100 %" );

        });



        HBox hBox1= new HBox (  );

        VBox vBox12 = new VBox (  );
        Button button1= new Button ( "btn1" );
        button1.setOnAction ( event -> {
            progressbar1.setStyle (
                    "-fx-padding: 10;"+
                    "-fx-background-color: rgba(255,12,11,0.53) "
            );
        } );
        Button button2= new Button ( "btn2" );
        Button button3= new Button ( "btn3" );
        Button button4= new Button ( "btn4" );
        Button button5= new Button ( "btn5" );
        vBox12.getChildren ().addAll ( button1,button2,button3,button4,button5 );


        vBox12.getChildren ().addAll (  );


        hBox1.getChildren ().addAll ( progressbar1,indicator01, label );

        HBox hBox2 = new HBox (  );
        hBox2.getChildren ().addAll ( btn5,btn1,btn2,btn3,btn4,btn6,btn7 );


        BorderPane borderPane = new BorderPane (  );
        borderPane.setTop ( hBox1 );
        borderPane.setBottom ( hBox2 );
        borderPane.setCenter ( textArea );
        borderPane.setRight ( vBox12 );
        borderPane.getStyleClass().add("LayoutStyle");
        borderPane.setStyle (

                "-fx-padding: 10;" +
                        "-fx-padding-bottom: 10;"+
                        "-fx-padding-top: 10;"+
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 10;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 2;" +
                "-fx-border-color: #ffa07b;"

        );

        Scene scene1= new Scene(borderPane,500,500);
        primaryStage.setScene(scene1);
        primaryStage.show();


        btn6.setOnAction ( event -> {
            primaryStage.getScene ();
            primaryStage.setScene ( new Scene(new VBox(btn7),300,300,Color.LIGHTBLUE)   );
        } );

//       this button disappaers after new scene opens

        btn7.setOnAction ( event -> {
            primaryStage.getScene ();
            primaryStage.setScene ( scene1 );


        } );


    }

}
