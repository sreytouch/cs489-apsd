package edu.miu.cs489.lab6.adssurgerydentalcli.service;

import edu.miu.cs489.lab6.adssurgerydentalcli.model.Dentist;

import java.util.List;

public interface DentistService {

    List<Dentist> getAllDentists();
    Dentist addNewDentist(Dentist newDentist);

    Dentist getDentistId(Integer dentistId);

    Dentist updateDentist(Dentist editedDentist);

    void deleteDentistById(Integer dentistId);

//    List<Dentist> getDentistByNameStart(String starFirstName);
}
