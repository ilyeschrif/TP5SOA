package service;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

@WebService

public class BanqueService {

    @WebMethod
    public double conversion(@WebParam(name = "montant")double montant) {
        return montant * 3.36;

    }


    @WebMethod
    public Compte getCompte(@WebParam(name = "codeCompte")int code) {
        return new Compte(code, 0, LocalDate.now());
    }

    @WebMethod
    public ArrayList<Compte> getcomptes() {
        ArrayList<Compte> listecompte = new ArrayList<Compte>();
        listecompte.add(new Compte(10, 500, LocalDate.now()));
        listecompte.add(new Compte(11, 1500, LocalDate.now()));

        return listecompte;
    }


}

