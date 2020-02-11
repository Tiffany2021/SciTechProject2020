package scitech;

public class ProjectMainClass{
    
    public static void main(String[] args) {
        
        PatientDataSource patientDatasource = new PatientScannerSource();
        PatientStatistics patientStatistics = new PatientStatistics(patientDatasource);
        
        
        patientStatistics.buildPatientArrayList();
        
        ProstheticDataSource prostheticDatasource = new ProstheticScannerSource();
        ProstheticStatistics prostheticStatistics = new ProstheticStatistics(prostheticDatasource);
        
        prostheticStatistics.buildProstheticArrayList();

        System.out.println(patientStatistics.SearchPatient());
        
        
        
    }

}