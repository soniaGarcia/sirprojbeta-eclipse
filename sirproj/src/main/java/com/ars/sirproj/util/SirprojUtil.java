package com.ars.sirproj.util;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class SirprojUtil  extends UtilConstant{
	public static Object webServiceProxy = null;
	
	public static Object getWebServiceProxy(Class<?> clazz, String endpoint, String timeout) {
		if (webServiceProxy == null) {
			JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
	    	jaxWsProxyFactoryBean.setServiceClass(clazz);
	    	jaxWsProxyFactoryBean.setAddress(endpoint);
	    	Object webServiceSoap = jaxWsProxyFactoryBean.create(clazz);
	    	Client client = ClientProxy.getClient(webServiceSoap);
	    	if (client != null) {
				HTTPConduit conduit = (HTTPConduit) client.getConduit();
				HTTPClientPolicy policy = new HTTPClientPolicy();
				policy.setConnectionTimeout(new Long(timeout));
				policy.setReceiveTimeout(new Long(timeout));
				conduit.setClient(policy);
			}
	    	webServiceProxy = webServiceSoap;
		}
		return webServiceProxy;
	}
	
	
	public static Object parseXmlResponse(String xml, Class<?> clazz) throws Exception {
		JAXBContext jbContext = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = jbContext.createUnmarshaller();
		Object response = unmarshaller.unmarshal(new StringReader(xml));
		return response;
	}
	
}
