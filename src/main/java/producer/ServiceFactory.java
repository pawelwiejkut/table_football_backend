package producer;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceFactory extends ODataJPAServiceFactory {
    private static final String PUNIT_NAME = "odataJPAService";

    @Override
    public ODataJPAContext initializeODataJPAContext() {

        ODataJPAContext oDataJPAContext = null;
        try {
            oDataJPAContext = this.getODataJPAContext();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(PUNIT_NAME);
            oDataJPAContext.setEntityManagerFactory(emf);
            oDataJPAContext.setPersistenceUnitName(PUNIT_NAME);
            } catch (ODataJPARuntimeException ex) {
        } catch (Exception ex) {
            Logger.getLogger(ServiceFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return oDataJPAContext;

    }
}