package com.mycompany.app.singleton;

public class ConfigManager {
    private static ConfigManager instance;
    private String idioma;
    private String tema;
    private boolean modoEscuro;

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void setConfig(String idioma, String tema, boolean modoEscuro) {
        this.idioma = idioma;
        this.tema = tema;
        this.modoEscuro = modoEscuro;
    }

    @Override
    public String toString() {
        return "ConfigManager [idioma=" + idioma + ", tema=" + tema + ", modoEscuro=" + modoEscuro + "]";
    } 

}