package eu.unifiedviews.projecttest;

//import cz.cuni.mff.xrg.uv.boost.dpu.addon.AddonInitializer;



//import cz.cuni.mff.xrg.uv.boost.dpu.advanced.DpuAdvancedBase;
//import cz.cuni.mff.xrg.uv.boost.dpu.config.MasterConfigObject;


import eu.unifiedviews.dataunit.DataUnit;
import eu.unifiedviews.dataunit.DataUnitException;
import eu.unifiedviews.dataunit.files.FilesDataUnit;
import eu.unifiedviews.dataunit.files.WritableFilesDataUnit;

/*import eu.unifiedviews.dataunit.rdf.RDFDataUnit;
import eu.unifiedviews.dataunit.rdf.WritableRDFDataUnit;
import eu.unifiedviews.dpu.DPU;
import eu.unifiedviews.dpu.DPUContext;
import eu.unifiedviews.dpu.DPUException;
import eu.unifiedviews.helpers.dataunit.dataset.DatasetBuilder;
import eu.unifiedviews.helpers.dataunit.fileshelper.FilesHelper;
import eu.unifiedviews.helpers.dataunit.virtualpathhelper.VirtualPathHelpers;
import eu.unifiedviews.helpers.dpu.config.AbstractConfigDialog;
import eu.unifiedviews.plugins.transformer.sparql.SPARQLConfig_V2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Set;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.OpenRDFException;
import org.openrdf.OpenRDFUtil;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.query.TupleQueryResultHandlerException;
import org.openrdf.query.UpdateExecutionException;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.rio.RDFFormat;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.io.File;
import java.nio.file.Path;
import java.util.Iterator;

*/



public class TestDPU {

  //  @DataUnit.AsInput(name = "filesInput")
  //  public FilesDataUnit filesInput;

  //   @DataUnit.AsOutput(name = "rdfOutput")
  //  public WritableRDFDataUnit rdfOuput;
    
	 private TestDPUConfig_V1 configInternal;

	
	 

	    /** public void execute(DPUContext context) throws DPUException {
        if (configInternal == null) {
            configInternal = migrateConfig(config);
        }
	     * The repository for SPARQL loader.
	     */
   // @DataUnit.AsInput(name = "rdfInput")
   // public static RDFDataUnit rdfInput;
    
    
  //  @DataUnit.AsOutput(name = "filesOUtput")
   // public WritableFilesDataUnit rdfOutput;
    
    
    // Definisco il log della DPU
	//private  final Logger LOG = LoggerFactory.getLogger(TestDPU.class);




	//private  final RDFDataUnit RepositoryConnection = null;
	
	
	//private Repository repository = null;
	
	
	

		
	public TestDPU() {
	//super(TestDPUConfig_V1.class, AddonInitializer.noAddons());
	}
	   
	/*
        public void execute(DPUContext context) throws DPUException, IOException {
		        if (configInternal == null) {
		          //  configInternal = migrateConfig(config);
		        } 
     
       */
	
	
   // LOG.info("DPU is running ...");
    
     
    
    /*
     
       RepositoryConnection  connection = null;
     
   
    try {
    	
    	
	URI outputGraph = rdfOutput.addNewDataGraph(configInternal.getOutputGraphSymbolicName());
   
	
    connection= rdfInput.getConnection();   
    TupleQuery query = connection.prepareTupleQuery(QueryLanguage.SPARQL, "SELECT {?s ?p ?o } WHERE { ?s ?p ?o }"); 
    TupleQueryResult result = query.evaluate();   
     while (result.hasNext()) {
        System.out.println(result.toString());
        
    }
          
    } catch (RepositoryException | QueryEvaluationException ex) {
        LOG.warn("IOException", ex);
        context.sendMessage(DPUContext.MessageType.ERROR, "DPU failed", "");
    } catch (MalformedQueryException ex) {
        LOG.warn("MalformedQueryException", ex);
        context.sendMessage(DPUContext.MessageType.ERROR, "Invalid query.", "", ex);
    } catch (DataUnitException ex) {
        context.sendMessage(DPUContext.MessageType.ERROR, "DPU Failed.", "Problem with DataUnit.", ex);
    }  finally {
    if (connection !=null) {
        try {
            connection.close();
        } catch (RepositoryException ex) {
            LOG.warn("Error in close", ex);
        }
        }
    }
    
    
    
}
*/
}
    

         
       
       
    

          
           
   
       
       

    
	

