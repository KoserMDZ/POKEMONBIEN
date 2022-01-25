package com.example.sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.util.Optional;
import java.util.Random;

public class Controller2 {

    @FXML
    public ImageView contrario;
    @FXML
    public ImageView yo;
    @FXML
    public ImageView fondo;

    @FXML
    public Button botonseguro;
    @FXML
    public Button botonarriesgado;
    @FXML
    public Button botonmuyarriesgado;
    @FXML
    public Button botoncancelar;
    @FXML
    public Button atacar;
    @FXML
    public Button curar;

    @FXML
    public ProgressBar lvlenemigo;
    @FXML
    public ProgressBar lvlyo;

    @FXML
    public Label nomenemigo;
    @FXML
    public Label nivelenemigo;
    @FXML
    public Label nomyo;
    @FXML
    public Label nivelyo;
    @FXML
    public Label restaryo;

    int contVida = 0;
    Pokemons contrincante = new Pokemons("Reshiram", 50, 200, "src\\main\\java\\imagenes\\Reshiram_NB.gif","src\\main\\java\\imagenes\\masculino.png","src\\main\\java\\imagenes\\Reshiram_NB.gif" );
    Pokemons nuevo;
    Controller controller;
    private final Random random = new Random();

    public void auxiliar(Pokemons pokemon) {

        File imagenFondo = new File("src\\main\\java\\imagenes\\capb.png");
        Image fondoSe= new Image(imagenFondo.toURI().toString());
        fondo.setImage(fondoSe);

        nuevo = pokemon;
        nomenemigo.setText(contrincante.nombre);
        nivelenemigo.setText("Nv." + contrincante.nivel);
        File imagenCont = new File(contrincante.imagen);
        Image image = new Image(imagenCont.toURI().toString());
        contrario.setImage(image);
        contVida = pokemon.vida;

        nomyo.setText(pokemon.nombre);
        nivelyo.setText("Nv." + pokemon.nivel);
        File imagenYo = new File(pokemon.fotoEsp);
        Image image2 = new Image(imagenYo.toURI().toString());
        yo.setImage(image2);
        restaryo.setText(pokemon.vida + "/" + contVida);
    }

    public void setVentana(Controller controller2) {
        controller = controller2;
    }

    public void clickAtacar() {
        atacar.setVisible(false);
        curar.setVisible(false);
        botonseguro.setVisible(true);
        botonarriesgado.setVisible(true);
        botonmuyarriesgado.setVisible(true);
        botoncancelar.setVisible(true);
    }

    public void clickCurar() {
        double curaryo = random.nextInt(50) + 25;
        double curarenemigo = random.nextInt(50) + 25;
        curaryo /= 100;
        curarenemigo /= 100;
        curarVida(curaryo, lvlyo);
        curarVida(curarenemigo, lvlenemigo);
        lvlyo.setProgress(lvlyo.getProgress() + curaryo);
        lvlenemigo.setProgress(lvlenemigo.getProgress() + curarenemigo);
    }

    public void curarVida(Double curar, ProgressBar progressBar) {
        double vida = nuevo.vida * curar;
        int resultado = (int) (nuevo.vida + vida);

        if (resultado >= nuevo.vida) {
            nuevo.vida = contVida;
            progressBar.setProgress(1);
        } else {
            nuevo.vida = resultado;
        }
        restaryo.setText(nuevo.vida + "/" + contVida);
    }

    public void clickSeguro() {
        bajarVida(0.2, restaryo);
        lvlyo.setProgress(lvlyo.getProgress() - 0.2);
        lvlenemigo.setProgress(lvlenemigo.getProgress() - 0.2);
        mensaje();
    }

    public void clickArriesgado() {
        double bajaryo = random.nextInt(15) + 10;
        double bajarenemigo = random.nextInt(15) + 10;
        bajaryo /= 100;
        bajarenemigo /= 100;
        bajarVida(bajaryo, restaryo);
        lvlyo.setProgress(lvlyo.getProgress() - bajaryo);
        lvlenemigo.setProgress(lvlenemigo.getProgress() - bajarenemigo);
        mensaje();
    }

    public void clickMuyArriesgado() {
        double bajaryo = random.nextInt(50);
        double bajarenemigo = random.nextInt(50);
        bajaryo /= 100;
        bajarenemigo /= 100;
        bajarVida(bajaryo, restaryo);
        lvlyo.setProgress(lvlyo.getProgress() - bajaryo);
        lvlenemigo.setProgress(lvlenemigo.getProgress() - bajarenemigo);
        mensaje();
    }

    public void clickCancelar() {
        atacar.setVisible(true);
        curar.setVisible(true);
        botonseguro.setVisible(false);
        botonarriesgado.setVisible(false);
        botonmuyarriesgado.setVisible(false);
        botoncancelar.setVisible(false);
    }

    public void bajarVida(Double dano, Label label) {
        double restar = nuevo.vida * dano;
        nuevo.vida = (int) (nuevo.vida - restar);
        label.setText(nuevo.vida + "/" + contVida);
    }

    public void mensaje() {
        if (lvlenemigo.getProgress() <= 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Fin del Combate");
            alert.setHeaderText("Enhorabuena");
            alert.setContentText("La victoria es tuya");
            alert.setGraphic(new ImageView(String.valueOf(this.getClass().getResource(contrincante.imagen))));
            Optional<ButtonType> resultado = alert.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                System.exit(0);
            } else if (resultado.get() == ButtonType.CANCEL) {
                controller.entrada(nuevo, lvlyo.getProgress());
                Stage stage = (Stage) botoncancelar.getScene().getWindow();
                stage.close();
            } else {
                System.out.println("Resultado = OTROS: " + resultado.get().getText());
            }
        }
        if (lvlyo.getProgress() <= 0) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Fin del Combate");
            alert.setHeaderText("Es una pena");
            alert.setContentText("Entrena y no te rindas");
            alert.setGraphic(new ImageView(String.valueOf(this.getClass().getResource(nuevo.imagen))));
            Optional<ButtonType> resultado = alert.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                System.exit(0);
            } else if (resultado.get() == ButtonType.CANCEL) {
                controller.entrada(nuevo, lvlyo.getProgress());
                Stage stage = (Stage) botoncancelar.getScene().getWindow();
                stage.close();
            } else {
                System.out.println("Resultado = OTROS: " + resultado.get().getText());
            }
        }
    }

}