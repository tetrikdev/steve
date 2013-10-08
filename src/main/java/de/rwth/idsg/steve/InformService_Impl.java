package de.rwth.idsg.steve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.rwth.idsg.sensor.inform.InformParkingRequest;
import de.rwth.idsg.sensor.inform.InformParkingResponse;
import de.rwth.idsg.sensor.inform.InformService;

/**
 * This class was generated by Apache CXF 2.3.1
 * Tue Oct 08 11:52:02 CEST 2013
 * Generated source version: 2.3.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "InformService",
                      portName = "InformServiceSOAP12",
                      targetNamespace = "urn://de/rwth/idsg/sensor/inform",
                      wsdlLocation = "file:/Users/sgokay/git/steve/src/main/webapp/SensorInformService.wsdl",
                      endpointInterface = "de.rwth.idsg.sensor.inform.InformService")
                      
public class InformService_Impl implements InformService {

	private static final Logger LOG = LoggerFactory.getLogger(InformService_Impl.class.getName());

	// Dummy implementation to test
    public InformParkingResponse informParking(InformParkingRequest parameters,java.lang.String chargeBoxIdentity) { 
        LOG.info("Executing operation informParking");
        InformParkingResponse _return = new InformParkingResponse();
        return _return;
    }
}