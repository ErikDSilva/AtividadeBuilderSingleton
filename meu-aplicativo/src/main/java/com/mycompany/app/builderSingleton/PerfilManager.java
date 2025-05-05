package com.mycompany.app.builderSingleton;

import java.util.ArrayList;
import java.util.List;

public class PerfilManager {
        private static PerfilManager instancia;
    private List<Perfil> perfis;

    private PerfilManager() {
        perfis = new ArrayList<>();
    }

    public static PerfilManager getInstance() {
        if (instancia == null) {
            instancia = new PerfilManager();
        }
        return instancia;
    }

    public void registrarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public void listarPerfis() {
        System.out.println("Perfis registrados:");
        for (Perfil p : perfis) {
            System.out.println(p);
        }
    }
}
