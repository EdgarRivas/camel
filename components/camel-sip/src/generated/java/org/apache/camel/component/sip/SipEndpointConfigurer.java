/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sip;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SipEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SipEndpoint target = (SipEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cacheconnections":
        case "cacheConnections": target.getConfiguration().setCacheConnections(property(camelContext, boolean.class, value)); return true;
        case "contentsubtype":
        case "contentSubType": target.getConfiguration().setContentSubType(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "eventheadername":
        case "eventHeaderName": target.getConfiguration().setEventHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventid":
        case "eventId": target.getConfiguration().setEventId(property(camelContext, java.lang.String.class, value)); return true;
        case "fromhost":
        case "fromHost": target.getConfiguration().setFromHost(property(camelContext, java.lang.String.class, value)); return true;
        case "fromport":
        case "fromPort": target.getConfiguration().setFromPort(property(camelContext, int.class, value)); return true;
        case "fromuser":
        case "fromUser": target.getConfiguration().setFromUser(property(camelContext, java.lang.String.class, value)); return true;
        case "msgexpiration":
        case "msgExpiration": target.getConfiguration().setMsgExpiration(property(camelContext, int.class, value)); return true;
        case "receivetimeoutmillis":
        case "receiveTimeoutMillis": target.getConfiguration().setReceiveTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "stackname":
        case "stackName": target.getConfiguration().setStackName(property(camelContext, java.lang.String.class, value)); return true;
        case "tohost":
        case "toHost": target.getConfiguration().setToHost(property(camelContext, java.lang.String.class, value)); return true;
        case "toport":
        case "toPort": target.getConfiguration().setToPort(property(camelContext, int.class, value)); return true;
        case "touser":
        case "toUser": target.getConfiguration().setToUser(property(camelContext, java.lang.String.class, value)); return true;
        case "transport": target.getConfiguration().setTransport(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumer": target.getConfiguration().setConsumer(property(camelContext, boolean.class, value)); return true;
        case "presenceagent":
        case "presenceAgent": target.getConfiguration().setPresenceAgent(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "addressfactory":
        case "addressFactory": target.getConfiguration().setAddressFactory(property(camelContext, javax.sip.address.AddressFactory.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "callidheader":
        case "callIdHeader": target.getConfiguration().setCallIdHeader(property(camelContext, javax.sip.header.CallIdHeader.class, value)); return true;
        case "contactheader":
        case "contactHeader": target.getConfiguration().setContactHeader(property(camelContext, javax.sip.header.ContactHeader.class, value)); return true;
        case "contenttypeheader":
        case "contentTypeHeader": target.getConfiguration().setContentTypeHeader(property(camelContext, javax.sip.header.ContentTypeHeader.class, value)); return true;
        case "eventheader":
        case "eventHeader": target.getConfiguration().setEventHeader(property(camelContext, javax.sip.header.EventHeader.class, value)); return true;
        case "expiresheader":
        case "expiresHeader": target.getConfiguration().setExpiresHeader(property(camelContext, javax.sip.header.ExpiresHeader.class, value)); return true;
        case "extensionheader":
        case "extensionHeader": target.getConfiguration().setExtensionHeader(property(camelContext, javax.sip.header.ExtensionHeader.class, value)); return true;
        case "fromheader":
        case "fromHeader": target.getConfiguration().setFromHeader(property(camelContext, javax.sip.header.FromHeader.class, value)); return true;
        case "headerfactory":
        case "headerFactory": target.getConfiguration().setHeaderFactory(property(camelContext, javax.sip.header.HeaderFactory.class, value)); return true;
        case "listeningpoint":
        case "listeningPoint": target.getConfiguration().setListeningPoint(property(camelContext, javax.sip.ListeningPoint.class, value)); return true;
        case "maxforwardsheader":
        case "maxForwardsHeader": target.getConfiguration().setMaxForwardsHeader(property(camelContext, javax.sip.header.MaxForwardsHeader.class, value)); return true;
        case "maxmessagesize":
        case "maxMessageSize": target.getConfiguration().setMaxMessageSize(property(camelContext, int.class, value)); return true;
        case "messagefactory":
        case "messageFactory": target.getConfiguration().setMessageFactory(property(camelContext, javax.sip.message.MessageFactory.class, value)); return true;
        case "sipfactory":
        case "sipFactory": target.getConfiguration().setSipFactory(property(camelContext, javax.sip.SipFactory.class, value)); return true;
        case "sipstack":
        case "sipStack": target.getConfiguration().setSipStack(property(camelContext, javax.sip.SipStack.class, value)); return true;
        case "sipuri":
        case "sipUri": target.getConfiguration().setSipUri(property(camelContext, javax.sip.address.SipURI.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "toheader":
        case "toHeader": target.getConfiguration().setToHeader(property(camelContext, javax.sip.header.ToHeader.class, value)); return true;
        case "viaheaders":
        case "viaHeaders": target.getConfiguration().setViaHeaders(property(camelContext, java.util.List.class, value)); return true;
        case "implementationdebuglogfile":
        case "implementationDebugLogFile": target.getConfiguration().setImplementationDebugLogFile(property(camelContext, java.lang.String.class, value)); return true;
        case "implementationserverlogfile":
        case "implementationServerLogFile": target.getConfiguration().setImplementationServerLogFile(property(camelContext, java.lang.String.class, value)); return true;
        case "implementationtracelevel":
        case "implementationTraceLevel": target.getConfiguration().setImplementationTraceLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "maxforwards":
        case "maxForwards": target.getConfiguration().setMaxForwards(property(camelContext, int.class, value)); return true;
        case "userouterforalluris":
        case "useRouterForAllUris": target.getConfiguration().setUseRouterForAllUris(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
