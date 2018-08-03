/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.uagean.dsIss.utils;

import gr.uagean.dsIss.model.pojo.IssAttribute;
import gr.uagean.dsIss.model.pojo.IssAttributeList;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author nikos
 */
public class Wrappers {

    public static IssAttributeList wrapEidasPropsToIssAttrs(List<String> eidasProperties) {
        IssAttributeList issAttrList = new IssAttributeList();
        final HashMap<String, IssAttribute> props = new HashMap();
        eidasProperties.stream().forEach(property -> {
            props.put(property, new IssAttribute(null, 0, 1));
        });
        issAttrList.setList(props);
        return issAttrList;
    }

    
    public static Map<String,String> cleanAttributes( Map<String, String> jsonMap, String attributesString) throws IndexOutOfBoundsException, IOException{
         
            Map<String, String> cleanMap = new HashMap();
            final String requestedAttributes =
                    StringUtils.deleteWhitespace(attributesString).toLowerCase();
            jsonMap.forEach( (key,value)->{
                if(requestedAttributes.contains(key.toLowerCase())){
                    cleanMap.put(key, value);
                }
            });
            return cleanMap;
    }
    
    
}
