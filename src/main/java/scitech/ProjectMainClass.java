package scitech;

public class ProjectMainClass{
    
    public static void main(String[] args) {
        
        PatientDataSource patientDatasource = new PatientScannerSource();
        PatientStatistics patientStatistics = new PatientStatistics(patientDatasource);
        
        patientStatistics.buildArrayList();
        
        
    }

}