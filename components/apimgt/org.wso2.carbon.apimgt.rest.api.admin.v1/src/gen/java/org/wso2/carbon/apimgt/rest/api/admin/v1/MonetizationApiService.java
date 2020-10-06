package org.wso2.carbon.apimgt.rest.api.admin.v1;

import org.wso2.carbon.apimgt.rest.api.admin.v1.*;
import org.wso2.carbon.apimgt.rest.api.admin.v1.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.apimgt.api.APIManagementException;

import org.wso2.carbon.apimgt.rest.api.admin.v1.dto.MonetizationUsagePublishInfoDTO;
import org.wso2.carbon.apimgt.rest.api.admin.v1.dto.PublishStatusDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.wso2.carbon.apimgt.rest.api.admin.v1.MonetizationApi.*;


public interface MonetizationApiService {
      public Response monetizationPublishUsagePost(MessageContext messageContext) throws APIManagementException;
      public Response monetizationPublishUsageStatusGet(MessageContext messageContext) throws APIManagementException;
}
