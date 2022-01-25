package com.example.sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    public Button Siguiente;

    @FXML
    public ImageView imagen1;
    @FXML
    public ImageView imagen2;
    @FXML
    public ImageView imagen3;
    @FXML
    public ImageView imagen4;
    @FXML
    public ImageView imagen5;
    @FXML
    public ImageView imagen6;

    @FXML
    public Label nombre1;
    @FXML
    public Label nivel1;
    @FXML
    public Label vida1;
    @FXML
    public Label nombre2;
    @FXML
    public Label nivel2;
    @FXML
    public Label vida2;
    @FXML
    public Label nombre3;
    @FXML
    public Label nivel3;
    @FXML
    public Label vida3;
    @FXML
    public Label nombre4;
    @FXML
    public Label nivel4;
    @FXML
    public Label vida4;
    @FXML
    public Label nombre5;
    @FXML
    public Label nivel5;
    @FXML
    public Label vida5;
    @FXML
    public Label nombre6;
    @FXML
    public Label nivel6;
    @FXML
    public Label vida6;

    @FXML
    public CheckBox cb1;
    @FXML
    public CheckBox cb2;
    @FXML
    public CheckBox cb3;
    @FXML
    public CheckBox cb4;
    @FXML
    public CheckBox cb5;
    @FXML
    public CheckBox cb6;

    @FXML
    public Pane p1;
    @FXML
    public Pane p2;
    @FXML
    public Pane p3;
    @FXML
    public Pane p4;
    @FXML
    public Pane p5;
    @FXML
    public Pane p6;

    @FXML
    public ProgressBar pb1;
    @FXML
    public ProgressBar pb2;
    @FXML
    public ProgressBar pb3;
    @FXML
    public ProgressBar pb4;
    @FXML
    public ProgressBar pb5;
    @FXML
    public ProgressBar pb6;

    @FXML
    public ImageView genero1;
    @FXML
    public ImageView genero2;
    @FXML
    public ImageView genero3;
    @FXML
    public ImageView genero4;
    @FXML
    public ImageView genero5;
    @FXML
    public ImageView genero6;



    Pokemons pokemon1 = new Pokemons("Cinccino",50,200,"src\\main\\java\\imagenes\\Cinccino_NB.gif","src\\main\\java\\imagenes\\masculino.png", "src\\main\\java\\imagenes\\Cinccino_espalda_G5.gif");
    Pokemons pokemon2 = new Pokemons("Gothitelle",50,200,"src\\main\\java\\imagenes\\Gothitelle_NB.gif","src\\main\\java\\imagenes\\masculino.png","src\\main\\java\\imagenes\\Gothihelle_espalda_G5.gif");
    Pokemons pokemon3 = new Pokemons("Manectric",50,200,"src\\main\\java\\imagenes\\Manectric.gif","src\\main\\java\\imagenes\\masculino.png","src\\main\\java\\imagenes\\Manetric_espalda_G5.gif");
    Pokemons pokemon4 = new Pokemons("Swanna",50,200,"src\\main\\java\\imagenes\\Swanna_NB.gif","src\\main\\java\\imagenes\\hembra.png","src\\main\\java\\imagenes\\Swanna_espalda_G5.gif");
    Pokemons pokemon5 = new Pokemons("Zoroark",50,200,"src\\main\\java\\imagenes\\Zoroark_NB.gif","src\\main\\java\\imagenes\\masculino.png","src\\main\\java\\imagenes\\Zoroark_espalda_G5.gif");
    Pokemons pokemon6 = new Pokemons("Zekrom",50,200,"src\\main\\java\\imagenes\\Zekrom_NB_variocolor.gif","src\\main\\java\\imagenes\\hembra.png","src\\main\\java\\imagenes\\Zekrom_espalda_G5_variocolor.gif");
    Pokemons auxiliar;

    @FXML
    public void initialize(){
        pokedex(nombre1,nivel1,vida1,imagen1,pokemon1,genero1);
        pokedex(nombre2,nivel2,vida2,imagen2,pokemon2,genero2);
        pokedex(nombre3,nivel3,vida3,imagen3,pokemon3,genero3);
        pokedex(nombre4,nivel4,vida4,imagen4,pokemon4,genero4);
        pokedex(nombre5,nivel5,vida5,imagen5,pokemon5,genero5);
        pokedex(nombre6,nivel6,vida6,imagen6,pokemon6,genero6);
    }

    public void clickImagen1(){
        cambiar(nombre1,nivel1,vida1,cb1,p1);
        pokemon1.imagen = "\\imagenes\\Cinccino_espalda_G5.gif";
        auxiliar = pokemon1;
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel5,vida5,cb5,p5);
        estatico(nombre6,nivel6,vida6,cb6,p6);
    }
    public void clickImagen2(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        cambiar(nombre2,nivel2,vida2,cb2,p2);
        pokemon2.imagen = "\\imagenes\\Gothitelle_espalda_G5.gif";
        auxiliar = pokemon2;
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel5,vida5,cb5,p5);
        estatico(nombre6,nivel6,vida6,cb6,p6);
    }
    public void clickImagen3(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        cambiar(nombre3,nivel3,vida3,cb3,p3);
        pokemon3.imagen = "\\imagenes\\Manectric_espalda_G5.gif";
        auxiliar = pokemon3;
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel5,vida5,cb5,p5);
        estatico(nombre6,nivel6,vida6,cb6,p6);
    }
    public void clickImagen4(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        cambiar(nombre4,nivel4,vida4,cb4,p4);
        pokemon4.imagen = "\\imagenes\\Swanna_espalda_G5.gif";
        auxiliar = pokemon4;
        estatico(nombre5,nivel5,vida5,cb5,p5);
        estatico(nombre6,nivel6,vida6,cb6,p6);
    }
    public void clickImagen5(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        cambiar(nombre5,nivel5,vida5,cb5,p5);
        pokemon5.imagen = "\\imagenes\\Zoroark_espalda_G5.gif";
        auxiliar = pokemon5;
        estatico(nombre6,nivel6,vida6,cb6,p6);
    }
    public void clickImagen6(){
        estatico(nombre1,nivel1,vida1,cb1,p1);
        estatico(nombre2,nivel2,vida2,cb2,p2);
        estatico(nombre3,nivel3,vida3,cb3,p3);
        estatico(nombre4,nivel4,vida4,cb4,p4);
        estatico(nombre5,nivel5,vida5,cb5,p5);
        cambiar(nombre6,nivel6,vida6,cb6,p6);
        pokemon6.imagen = "\\imagenes\\Zekrom_espalda_G5_variocolor.gif";
        auxiliar = pokemon6;
    }

    public void pokedex(Label nombre, Label nivel, Label vida, ImageView imagen, Pokemons pokemon, ImageView genero) {
        nombre.setText(pokemon.nombre);
        nivel.setText("Nv. "+pokemon.nivel);
        vida.setText(pokemon.vida+"/"+pokemon.vida);
        File imagenPoke = new File(pokemon.imagen);
        Image image = new Image(imagenPoke.toURI().toString());
        File generoFile = new File(pokemon.genero);
        Image generos = new Image(generoFile.toURI().toString());
        imagen.setImage(image);
        genero.setImage(generos);

    }

    public void cambiar(Label nombre, Label nivel, Label vida, CheckBox checkbox, Pane pane) {
        nombre.setStyle("-fx-text-fill: blue;");
        nivel.setStyle("-fx-text-fill: blue;");
        vida.setStyle("-fx-text-fill: blue;");
        checkbox.setSelected(true);
        pane.setStyle("-fx-background-color: #85C1E9");
    }

    public void estatico(Label nombre, Label nivel, Label vida, CheckBox checkbox, Pane pane) {
        nombre.setStyle("-fx-text-fill: #ffffff;");
        nivel.setStyle("-fx-text-fill: #ffffff;");
        vida.setStyle("-fx-text-fill: #ffffff;");
        checkbox.setSelected(false);
        pane.setStyle("-fx-background-color: #8E44AD");
    }

    public void clickSiguiente() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/PantallaLucha.fxml"));
        GridPane root = loader.load();
        Scene scene = new Scene(root,600,500);
        stage.setScene(scene);
        stage.show();

        Controller2 controller2 = loader.getController();
        controller2.auxiliar(auxiliar);
        controller2.setVentana(this);
    }

    public void entrada(Pokemons pokemon, Double progressbar){
        if (pokemon.nombre.equals(pokemon1.nombre)){
            vida1.setText(pokemon.vida+"/"+pokemon1.vida);
            pb1.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon2.nombre)){
            vida2.setText(pokemon.vida+"/"+pokemon2.vida);
            pb2.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon3.nombre)){
            vida3.setText(pokemon.vida+"/"+pokemon3.vida);
            pb3.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon4.nombre)){
            vida4.setText(pokemon.vida+"/"+pokemon4.vida);
            pb4.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon5.nombre)){
            vida5.setText(pokemon.vida+"/"+pokemon5.vida);
            pb5.setProgress(progressbar);
        }
        if (pokemon.nombre.equals(pokemon6.nombre)){
            vida6.setText(pokemon.vida+"/"+pokemon6.vida);
            pb6.setProgress(progressbar);
        }
    }

}
