/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.primid.logic.persistence;

import co.edu.uniandes.csw.primid.logic.entities.PlanEventoEntity;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import junit.framework.Assert;
import static org.glassfish.pfl.basic.tools.argparser.ElementParser.factory;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author Sebastian
 */
@RunWith(Arquillian.class)
public class PlanEventoPersistenceTest {
    
    @Inject
    private PlanEventoPersistence planEventoPersistence;
    @PersistenceContext
    private EntityManager em ;
    private final PodamFactory factory = new PodamFactoryImpl();
    
    public PlanEventoPersistenceTest() {
        
    }
    
    @Deployment
    public static JavaArchive createDeployment()
    {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(PlanEventoEntity.class.getPackage())
                .addPackage(PlanEventoPersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml","persistence.xml")
                .addAsManifestResource("META-INF/beans.xml","beans.xml");
        
    }

    @Test
    public void createPlanEventoTest() {
        
        PlanEventoEntity newEntity= factory.manufacturePojo(PlanEventoEntity.class);
        
        PlanEventoEntity result = planEventoPersistence.create(newEntity);
        
       
        Assert.assertNotNull(result);
    }
    
}