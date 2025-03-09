package com.rocs.medical.records.application.app.facade.medicalRecord.createMedicalRecords.impl;

import com.rocs.medical.records.application.app.facade.medicalRecord.createMedicalRecords.CreateMedicalRecordsFacade;
import com.rocs.medical.records.application.data.dao.medicalRecord.createMedicalRecords.createMedicalRecordsDao;
import com.rocs.medical.records.application.data.dao.medicalRecord.createMedicalRecords.impl.createMedicalRecordsDaoImpl;
import com.rocs.medical.records.application.model.medicalrecord.createmedicalrecords.MedicalRecords;


public class CreateMedicalRecordsFacadeImpl implements CreateMedicalRecordsFacade {

    private final createMedicalRecordsDao medicalRecordsDao = new createMedicalRecordsDaoImpl();

    @Override
    public boolean AddStudentMedicalRecord(MedicalRecords record) {
        return medicalRecordsDao.createMedicalRecord(record);
    }

    }
