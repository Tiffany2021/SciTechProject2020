package scitech;

public class ProjectMainClass{
    
    public static void main(String[] args) {
                       
        ProstheticDataSource prostheticDatasource = new ProstheticScannerSource();
        ProstheticStatistics prostheticStatistics = new ProstheticStatistics(prostheticDatasource);
        
        PatientDataSource patientDatasource = new PatientScannerSource();
        PatientStatistics patientStatistics = new PatientStatistics(patientDatasource, prostheticStatistics);
        
        patientStatistics.buildPatientArrayList();
        prostheticStatistics.buildProstheticArrayList();

        System.out.println(patientStatistics.SearchPatient());
        
    }

}