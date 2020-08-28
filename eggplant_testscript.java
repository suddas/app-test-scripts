// Script Created on Filtered trace created on Fri Aug 28 12:04:02 2020
// Script Generator Version 9.0.4.201

package com.testplant.testing;

import java.time.Duration;
import java.time.ZoneOffset;
import java.util.EnumSet;
import java.util.List;
import java.util.ArrayList;

import com.facilita.fc.runtime.*;
import com.facilita.fc.runtime.backgroundScripting.*;
import com.facilita.util.*;
import com.facilita.exception.*;
import com.facilita.fc.web.*;
import com.facilita.fc.jni.*;


// #region EPP_IMPORTS

// Code added here will be preserved during script regeneration

// #endregion EPP_IMPORTS

public class keysight_sample_2 extends com.testplant.testing.first_testScript
{

	// Generated variables
	IpEndPoint keysight = null;  // a parameterized web server address
	IpEndPoint noam = null;  // a parameterized web server address
	IpEndPoint assets = null;  // a parameterized web server address
	IpEndPoint polyfill = null;  // a parameterized web server address
	IpEndPoint dpm = null;  // a parameterized web server address
	IpEndPoint smetrics = null;  // a parameterized web server address
	IpEndPoint cdn = null;  // a parameterized web server address
	IpEndPoint cm = null;  // a parameterized web server address
	IpEndPoint agilenttechnologies = null;  // a parameterized web server address
	IpEndPoint googletagmanager = null;  // a parameterized web server address
	IpEndPoint script_ = null;  // a parameterized web server address
	IpEndPoint agilent = null;  // a parameterized web server address
	IpEndPoint connect = null;  // a parameterized web server address
	IpEndPoint snap = null;  // a parameterized web server address
	IpEndPoint static_ = null;  // a parameterized web server address
	IpEndPoint ssl = null;  // a parameterized web server address
	IpEndPoint googleadservices = null;  // a parameterized web server address
	IpEndPoint keysight_h = null;  // a parameterized web server address
	IpEndPoint youtube = null;  // a parameterized web server address
	IpEndPoint img = null;  // a parameterized web server address
	IpEndPoint px = null;  // a parameterized web server address
	IpEndPoint google_analytics = null;  // a parameterized web server address
	IpEndPoint t = null;  // a parameterized web server address
	IpEndPoint googleads = null;  // a parameterized web server address
	IpEndPoint analytics = null;  // a parameterized web server address
	IpEndPoint s = null;  // a parameterized web server address
	IpEndPoint facebook = null;  // a parameterized web server address
	IpEndPoint s609785623 = null;  // a parameterized web server address
	IpEndPoint linkedin = null;  // a parameterized web server address
	IpEndPoint stats = null;  // a parameterized web server address
	IpEndPoint google = null;  // a parameterized web server address
	IpEndPoint google_com = null;  // a parameterized web server address
	IpEndPoint outlook = null;  // a parameterized web server address
	IpEndPoint js_agent = null;  // a parameterized web server address
	IpEndPoint consent = null;  // a parameterized web server address
	IpEndPoint p = null;  // a parameterized web server address
	IpEndPoint southcentralus_prod_2 = null;  // a parameterized web server address
	IpEndPoint bam = null;  // a parameterized web server address
	Protocol protocol1 = null;  // a parameterized protocol
	// End of generated variables

	// Your global variables
	// #region EPP_GLOBAL_VARIABLES

	// Code added here will be preserved during script regeneration

	// #endregion EPP_GLOBAL_VARIABLES
	// End of your global variables

	public void pre() throws Exception
	{
		//do not remove following line
		super.pre();

		// The following INITIALISATION is executed once only.
		// START INITIALISATION CODE
		getWebBrowser().setDefaultUserAgent(getString("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; rv:11.0) like Gecko"));
		getWebBrowser().setDefaultHeader("Accept", "*/*");
		getWebBrowser().setDefaultHeader("Accept-Language", "en-US");
		getWebBrowser().setDefaultHeader("Accept-Encoding", "gzip, deflate");
		getWebBrowser().setDefaultFollowRedirects(true);
		getWebBrowser().setDefaultRetrieveSubRequests(true);
		getWebBrowser().setHostFilteringMode(HostFilteringMode.WHITELIST);
		// The following char encodings were found:-  ISO-8859-1 UTF-8 iso-8859-1 utf-8

		// END INITIALISATION CODE

		// Put any code that needs to execute at the start of the test here
		// #region EPP_PRE

		// Code added here will be preserved during script regeneration

		// #endregion EPP_PRE
	}

	public void script() throws Exception
	{

		// This 'script' method is the main method executed by the runtime engine.
		keysight = new IpEndPoint(getString("keysightHost", "www.keysight.com"), getInt("keysightPort", 443));
		noam = new IpEndPoint(getString("noamHost", "noam.presence.teams.microsoft.com"), getInt("noamPort", 443));
		assets = new IpEndPoint(getString("assetsHost", "assets.adobedtm.com"), getInt("assetsPort", 443));
		polyfill = new IpEndPoint(getString("polyfillHost", "polyfill.io"), getInt("polyfillPort", 443));
		dpm = new IpEndPoint(getString("dpmHost", "dpm.demdex.net"), getInt("dpmPort", 443));
		smetrics = new IpEndPoint(getString("smetricsHost", "smetrics.keysight.com"), getInt("smetricsPort", 443));
		cdn = new IpEndPoint(getString("cdnHost", "cdn.loop11.com"), getInt("cdnPort", 443));
		cm = new IpEndPoint(getString("cmHost", "cm.everesttech.net"), getInt("cmPort", 443));
		agilenttechnologies = new IpEndPoint(getString("agilenttechnologiesHost", "agilenttechnologies.tt.omtrdc.net"), getInt("agilenttechnologiesPort", 443));
		googletagmanager = new IpEndPoint(getString("googletagmanagerHost", "www.googletagmanager.com"), getInt("googletagmanagerPort", 443));
		script_ = new IpEndPoint(getString("script_Host", "script.crazyegg.com"), getInt("script_Port", 443));
		agilent = new IpEndPoint(getString("agilentHost", "agilent.demdex.net"), getInt("agilentPort", 443));
		connect = new IpEndPoint(getString("connectHost", "connect.facebook.net"), getInt("connectPort", 443));
		snap = new IpEndPoint(getString("snapHost", "snap.licdn.com"), getInt("snapPort", 443));
		static_ = new IpEndPoint(getString("static_Host", "static.ads-twitter.com"), getInt("static_Port", 443));
		ssl = new IpEndPoint(getString("sslHost", "ssl.google-analytics.com"), getInt("sslPort", 443));
		googleadservices = new IpEndPoint(getString("googleadservicesHost", "www.googleadservices.com"), getInt("googleadservicesPort", 443));
		keysight_h = new IpEndPoint(getString("keysight_hHost", "keysight-h.assetsadobe.com"), getInt("keysight_hPort", 443));
		youtube = new IpEndPoint(getString("youtubeHost", "www.youtube.com"), getInt("youtubePort", 443));
		img = new IpEndPoint(getString("imgHost", "img.en25.com"), getInt("imgPort", 443));
		px = new IpEndPoint(getString("pxHost", "px.ads.linkedin.com"), getInt("pxPort", 443));
		google_analytics = new IpEndPoint(getString("google_analyticsHost", "www.google-analytics.com"), getInt("google_analyticsPort", 443));
		t = new IpEndPoint(getString("tHost", "t.co"), getInt("tPort", 443));
		googleads = new IpEndPoint(getString("googleadsHost", "googleads.g.doubleclick.net"), getInt("googleadsPort", 443));
		analytics = new IpEndPoint(getString("analyticsHost", "analytics.twitter.com"), getInt("analyticsPort", 443));
		s = new IpEndPoint(getString("sHost", "s.ytimg.com"), getInt("sPort", 443));
		facebook = new IpEndPoint(getString("facebookHost", "www.facebook.com"), getInt("facebookPort", 443));
		s609785623 = new IpEndPoint(getString("s609785623Host", "s609785623.t.eloqua.com"), getInt("s609785623Port", 443));
		linkedin = new IpEndPoint(getString("linkedinHost", "www.linkedin.com"), getInt("linkedinPort", 443));
		stats = new IpEndPoint(getString("statsHost", "stats.g.doubleclick.net"), getInt("statsPort", 443));
		google = new IpEndPoint(getString("googleHost", "www.google.co.in"), getInt("googlePort", 443));
		google_com = new IpEndPoint(getString("google_comHost", "www.google.com"), getInt("google_comPort", 443));
		outlook = new IpEndPoint(getString("outlookHost", "outlook.office365.com"), getInt("outlookPort", 443));
		js_agent = new IpEndPoint(getString("js_agentHost", "js-agent.newrelic.com"), getInt("js_agentPort", 443));
		consent = new IpEndPoint(getString("consentHost", "consent.truste.com"), getInt("consentPort", 443));
		p = new IpEndPoint(getString("pHost", "p.adsymptotic.com"), getInt("pPort", 443));
		southcentralus_prod_2 = new IpEndPoint(getString("southcentralus_prod_2Host", "southcentralus-prod-2.notifications.teams.microsoft.com"), getInt("southcentralus_prod_2Port", 443));
		bam = new IpEndPoint(getString("bamHost", "bam.nr-data.net"), getInt("bamPort", 443));

		protocol1 = getProtocol("protocol1", "https");
		// Only requests to the hosts below will be included in the test
		getWebBrowser().includeHost(getString("googletagmanagerHost", "www.googletagmanager.com"));
		getWebBrowser().includeHost(getString("snapHost", "snap.licdn.com"));
		getWebBrowser().includeHost(getString("keysight_hHost", "keysight-h.assetsadobe.com"));
		getWebBrowser().includeHost(getString("consentHost", "consent.truste.com"));
		getWebBrowser().includeHost(getString("keysightHost", "www.keysight.com"));
		getWebBrowser().includeHost(getString("assetsHost", "assets.adobedtm.com"));
		getWebBrowser().includeHost(getString("js_agentHost", "js-agent.newrelic.com"));
		getWebBrowser().includeHost(getString("connectHost", "connect.facebook.net"));
		getWebBrowser().includeHost(getString("agilenttechnologiesHost", "agilenttechnologies.tt.omtrdc.net"));
		getWebBrowser().includeHost(getString("static_Host", "static.ads-twitter.com"));
		getWebBrowser().includeHost(getString("cmHost", "cm.everesttech.net"));
		getWebBrowser().includeHost(getString("sHost", "s.ytimg.com"));
		getWebBrowser().includeHost(getString("statsHost", "stats.g.doubleclick.net"));
		getWebBrowser().includeHost(getString("tHost", "t.co"));
		getWebBrowser().includeHost(getString("s609785623Host", "s609785623.t.eloqua.com"));
		getWebBrowser().includeHost(getString("dpmHost", "dpm.demdex.net"));
		getWebBrowser().includeHost(getString("googleadsHost", "googleads.g.doubleclick.net"));
		getWebBrowser().includeHost(getString("cdnHost", "cdn.loop11.com"));
		getWebBrowser().includeHost(getString("youtubeHost", "www.youtube.com"));
		getWebBrowser().includeHost(getString("polyfillHost", "polyfill.io"));
		getWebBrowser().includeHost(getString("noamHost", "noam.presence.teams.microsoft.com"));
		getWebBrowser().includeHost(getString("pHost", "p.adsymptotic.com"));
		getWebBrowser().includeHost(getString("script_Host", "script.crazyegg.com"));
		getWebBrowser().includeHost(getString("googleadservicesHost", "www.googleadservices.com"));
		getWebBrowser().includeHost(getString("outlookHost", "outlook.office365.com"));
		getWebBrowser().includeHost(getString("bamHost", "bam.nr-data.net"));
		getWebBrowser().includeHost(getString("analyticsHost", "analytics.twitter.com"));
		getWebBrowser().includeHost(getString("facebookHost", "www.facebook.com"));
		getWebBrowser().includeHost(getString("pxHost", "px.ads.linkedin.com"));
		getWebBrowser().includeHost(getString("linkedinHost", "www.linkedin.com"));
		getWebBrowser().includeHost(getString("southcentralus_prod_2Host", "southcentralus-prod-2.notifications.teams.microsoft.com"));
		getWebBrowser().includeHost(getString("agilentHost", "agilent.demdex.net"));
		getWebBrowser().includeHost(getString("imgHost", "img.en25.com"));
		getWebBrowser().includeHost(getString("googleHost", "www.google.com"));
		getWebBrowser().includeHost(getString("smetricsHost", "smetrics.keysight.com"));
		getWebBrowser().includeHost(getString("sslHost", "ssl.google-analytics.com"));
		getWebBrowser().includeHost(getString("google_analyticsHost", "www.google-analytics.com"));
		getWebBrowser().includeHost(getString("googleHost", "www.google.co.in"));

		// Actions
		// Note: if you have complex logic that you would like to preserve between re-generations of the script,
		// you can turn on the "Script Actions" region in the Advanced web script generation options
		Action1_Start();

		// Put your code for finalizing the script here
		// #region EPP_SCRIPT

		// Code added here will be preserved during script regeneration

		// #endregion EPP_SCRIPT
	}


	void Action1_Start() throws Exception
	{

		// #region EPP_BEFORE_START_TRANSACTION for Transaction "Start"

		// Code added here will be preserved during script regeneration

		// #endregion EPP_BEFORE_START_TRANSACTION for Transaction "Start"

		startTransaction("Start");

		// ====================================================================================================================================
		// Request: 1, GET, https://www.keysight.com/, response code=301 Moved Permanently, redirect occurred, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Page Title: Electronic design, test automation & measurement equipment | Keysight
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plerCm4QQZOvnxa5TD8l11ug47P/ONmZrzmNGqJ68HxBrgxT4PGiVzg5I0XRuY9WoPggzIot6yLakGmPtFt3BKV3y3so7fU6uTwk8DojMbBN3BnqvYj0BnQY1UnBEzew3OWxUdJvOBQ+8qgLALQ4csHpqpmmAWYMlWHspdtX8l4mapy/UmoKTSavSwe0SNtdQBqWXVHU7c/RjNmzTsH7dlwvP8eManyvT0QbYKQxpJAMY=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:22 GMT; Max-Age=7200; Path=/;
		//  bm_mi=41EC58C0371FC138C5C92296C9F46E5E~TJ3v3oiGzWYiVei2YgET//Xi1wYXxw5AfmN7lGlYb/rZp5Cv84wFemDlBKTrpRuZPcGeQ2o35oxZjKDHVwPFiELVK3GEwqDFCZKpDwmcEhuMJVmbkg9AM1CEmWEIYqm4W8r7G9U9aRkNHbiTjf9dV2VYzFeCvMRqiD+Qp174yufDDcFejSX35kB45oKQbsUR+IRLj6VpjAV0INeKV+RI1Zb2voBtvWMRlERfixWSXVM2XT/jJ/shJy8RQMr2wFjU; Domain=.keysight.com; expires=Fri, 28 Aug 2020 06:32:22 GMT; Path=/;
		Url url2 = new Url(protocol1, keysight, "/");
		try (Request request2 = getWebBrowser().createRequest(HttpMethod.GET, url2, 2))
		{
			request2.setHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*");
			request2.setHeader("DNT", "1");
			request2_ProcessSubRequests(request2);

			// #region EPP_BEFORE_REQUEST_SENT for Request 2

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 2

			try (Response response2 = request2.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 2

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 2

				// Request: 2, GET, https://www.keysight.com/us/en/home.html, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]

				// Rule: Verify that the result code matches what was recorded
				response2.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 16, POST, https://noam.presence.teams.microsoft.com/v1/me/reportmyactivity/, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// All POST requests are top level
		// ====================================================================================================================================
		Url url16 = new Url(protocol1, noam, "/v1/me/reportmyactivity/");
		try (Request request16 = getWebBrowser().createRequest(HttpMethod.POST, url16, 16))
		{
			request16.setHeader("Accept", "json");
			request16.setHeader("Accept-Encoding", "gzip, deflate, br");
			request16.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Teams/1.3.00.13565 Chrome/69.0.3497.128"
				 + " Electron/4.2.12 Safari/537.36");
			request16.setReferer(new Url(protocol1, new IpEndPoint("teams.microsoft.com", 443), "/_"));
			request16.setHeader("BehaviorOverride", "redirectAs404");
			request16.setHeader("Content-Type", "application/json");
			request16.setHeader("Origin", "https://teams.microsoft.com");
			request16.setHeader("x-ms-client-env", "pckgsvc-prod-c1-asse-02");
			request16.setHeader("x-ms-client-type", "desktop");
			request16.setHeader("x-ms-client-version", "27/1.0.0.2020082614");
			request16.setHeader("x-ms-correlation-id", "f04f1c16-137f-4a73-8421-153c67963d78");
			request16.setHeader("x-ms-endpoint-id", "a9a4b7c9-117b-488c-a2bf-e1feb16b2c58");
			request16.setHeader("x-ms-scenario-id", "815");
			request16.setHeader("x-ms-session-id", "537c7c86-ee02-8e79-ed97-9438cf2ea01a");
			request16.setHeader("x-ms-user-type", "null");
			String postDataString16 = "{"
				+ "\"endpointId\": \"a9a4b7c9-117b-488c-a2bf-e1feb16b2c58\","
				+ "\"isActive\": true"
			+ "}";
			request16.setMessageBody(postDataString16);

			// #region EPP_BEFORE_REQUEST_SENT for Request 16

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 16

			try (Response response16 = request16.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 16

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 16

				// Rule: Verify that the result code matches what was recorded
				response16.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 17, GET, https://www.keysight.com/in/en/home.html, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		getWebBrowser().saveCookie(keysight.host(), "AG_LOCALE=INeng");
		getWebBrowser().saveCookie(keysight.host(), "ks_tooltip=INeng");
		getWebBrowser().saveCookie(smetrics.host(), "AG_LOCALE=INeng");
		getWebBrowser().saveCookie(smetrics.host(), "AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1");
		getWebBrowser().saveCookie(smetrics.host(), "AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444"
			 + "77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH"
			 + "aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603546s%7CNONE%7CvVersion%7C4.6.0");
		getWebBrowser().saveCookie(smetrics.host(), "ks_tooltip=INeng");
		getWebBrowser().saveCookie(keysight.host(), "AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1");
		getWebBrowser().saveCookie(keysight.host(), "AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444"
			 + "77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH"
			 + "aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CvVersion%7C4.6.0");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_landing_page=https://" + keysight.host() + "/in/en/home.html|" + getMillisecondsSinceEpoch(824) /* Replaced timestamp 1598596345023 (2020-08-28T12:02:25.023000+05:30) */ + "");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_lt_pages_viewed=1");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_pages_viewed=1");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_session_count=1");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_traffic_source=https://" + keysight.host() + "/us/en/home.html");
		getWebBrowser().saveCookie(keysight.host(), "check=true");
		getWebBrowser().saveCookie(keysight.host(), "mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#" + getSecondsSinceEpoch(1862) /* Replaced timestamp 1598598207 (2020-08-28T12:33:27+05:30) */ + "");
		getWebBrowser().saveCookie(keysight.host(), "cookies=cookies");
		getWebBrowser().saveCookie(keysight.host(), "referrer=Web%20Link%20Referrals");
		getWebBrowser().saveCookie(smetrics.host(), "check=true");
		getWebBrowser().saveCookie(smetrics.host(), "cookies=cookies");
		getWebBrowser().saveCookie(smetrics.host(), "mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#" + getSecondsSinceEpoch(1865) /* Replaced timestamp 1598598210 (2020-08-28T12:33:30+05:30) */ + "|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150");
		getWebBrowser().saveCookie(smetrics.host(), "s_cc=true");
		getWebBrowser().saveCookie(keysight.host(), "_ga=GA1.2.1689172026.1598596353");
		getWebBrowser().saveCookie(keysight.host(), "_gat_43b0a442b086b5e859d5435951d9b278=1");
		getWebBrowser().saveCookie(keysight.host(), "_gid=GA1.2.416552926.1598596353");
		getWebBrowser().saveCookie(keysight.host(), "s_cc=true");
		getWebBrowser().saveCookie(keysight.host(), "_fbp=fb.1.1598596355048.1423242099");
		getWebBrowser().saveCookie(keysight.host(), "s_sq=agilentcom%3D%2526c.%2526a.%2526activitymap.%2526page%253DKS%252520Home%252520Page%2526link%253"
			 + "DProducts%252520%25252B%252520Services%2526region%253Dgnavbar%2526pageIDType%253D1%2526.activitymap%"
			 + "2526.a%2526.c%2526pid%253DKS%252520Home%252520Page%2526pidt%253D1%2526oid%253Dhttps%25253A%25252F%25252F" + keysight.host() + "%25252Fin%25252Fen%25252Fproducts.html%2526ot%253DA%2526oi%253D286");
		getWebBrowser().saveCookie(smetrics.host(), "_fbp=fb.1.1598596355048.1423242099");
		getWebBrowser().saveCookie(smetrics.host(), "_ga=GA1.2.1689172026.1598596353");
		getWebBrowser().saveCookie(smetrics.host(), "_gat_43b0a442b086b5e859d5435951d9b278=1");
		getWebBrowser().saveCookie(smetrics.host(), "_gid=GA1.2.416552926.1598596353");
		getWebBrowser().saveCookie(smetrics.host(), "s_sq=%5B%5BB%5D%5D");
		// Page Title: Electronic design, test automation & measurement equipment | Keysight
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plwbIPbQcai7EKjFAJXSQK0Wr8T
		// ciTwz/Um5ANDBgnWk9XYFizQhtkPmif3l53lLrO5vwkMUOYrXDCrpqckG2s6Gt/gtu71J0emE6HXqFetPBbYD8/ZZu1a2Qt/9O2B
		// 1JYk+LDe7quLn78jqHGU7rrj5PUS3Bmr9VxMvQm/Y7EtIxXQG0M27/Hz2wg0C4Na8S7ma15cTg50gUHOfc2iCr/I1FG3JeNu+K1K
		// TvLRGNbk2vlF1hnKHkEXrQBzwVjTVlcDtk5n+PGRsaIJ3XaekSlYzCn2lZBv6wXQMD61fGhowmqzy3jvmmghnWKs2L/Fdo78l3Td
		// hyCibRH/4a3q3S47w==
		//  AG_LOCALE=INeng
		//  ks_tooltip=INeng
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0EZA/ikltPE2T69n+7sfLKQri6zYCoBB5GqZR4iE6MSwYqtpUxk1r9dr4Wj/jajhTH5n4IIdjnz8o2NThOH0YbaFu5SfS8bK6sja0Bl033oOJJSJaDpqJMvHNiqpRD+37XOeDtgEytQdpF3pIRHBTd6wSJJY0IfNRCrzefX5DHoXcevoFsZLf31SLxsu6dGGfELX; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:22 GMT; Path=/;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUYxvK6y0KY2zWlABJnAfasaCOd4GaxummQTfH8KyabZe1lW8CoRZfW/NEBMYjsjQM=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url17 = new Url(protocol1, keysight, "/in/en/home.html");
		try (Request request17 = getWebBrowser().createRequest(HttpMethod.GET, url17, 17))
		{
			request17.setHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*");
			request17.setHeader("DNT", "1");
			request17_ProcessSubRequests(request17);

			// #region EPP_BEFORE_REQUEST_SENT for Request 17

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 17

			try (Response response17 = request17.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 17

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 17

				// Rule: Verify that the page title matches what was recorded
				response17.verifyTitle("Electronic design, test automation &amp; measurement equipment | Keysight", ActionType.ACT_WARNING);
				// Rule: Verify that the result code matches what was recorded
				response17.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 81, GET, https://www.keysight.com/libs/granite/csrf/token.json, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plwbIPbQcai7EKjFAJXSQK0Wr8T
		// ciTwz/Um5ANDBgnWk9XYFizQhtkPmif3l53lLrO5vwkMUOYrXDCrpqckG2s6Gt/gtu71J0emE6HXqFetPBbYD8/ZZu1a2Qt/9O2B
		// 1JYk+LDe7quLn78jqHGU7rrj5PUS3Bmr9VxMvQm/Y7EtIxXQG0M27/Hz2wg0C4Na8S7ma15cTg50gUHOfc2iCr/I1FG3JeNu+K1K
		// TvLRGNbk2vlF1hnKHkEXrQBzwVjTVlcDtk5n+PGRsaIJ3XaekSlYzCn2lZBv6wXQMD61fGhowmqzy3jvmmghnWKs2L/Fdo78l3Td
		// hyCibRH/4a3q3S47w==
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  ks_tooltip=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUYxvK6y0KY2zWlABJnAfasaCOd4GaxummQTfH8KyabZe1lW8CoRZfW/
		// NEBMYjsjQM=
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2; Max-Age=3600; Path=/;
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2; Max-Age=3600; Path=/;
		//  SECURE;SAMESITE=None;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUGxQaYAFqUYo+23OO236bSiI6HGz3y2wyw9JJZz5Th6n5ZSj2uxl7dN4CT0Q5e9GI=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url81 = new Url(protocol1, keysight, "/libs/granite/csrf/token.json");
		try (Request request81 = getWebBrowser().createRequest(HttpMethod.GET, url81, 81))
		{
			request81.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 81

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 81

			try (Response response81 = request81.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 81

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 81

				// Rule: Verify that the result code matches what was recorded
				response81.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 83, GET, https://dpm.demdex.net/id?d_visid_ver=4.6.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=6BA0655351E5642F0A490D44%40AdobeOrg&d_nsid=0&ts=1598596345037, response code=302 Found, redirect occurred, overlapping top-level requests:[], other overlapping requests:[82]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		// Cookie(s) set by server:
		//  Secure;SameSite=None;
		//  demdex=10343804049503213874492851632238412194; Domain=.demdex.net; expires=Wed, 24-Feb-2021 06:32:26 GMT; Max-Age=15552000; Path=/;
		Url url84 = new Url(protocol1, dpm, "/id");
		QueryData queryData84 = new QueryData();
		queryData84.add("d_visid_ver", "4.6.0");
		queryData84.add("d_fieldgroup", "MC");
		queryData84.add("d_rtbd", "json");
		queryData84.add("d_ver", "2");
		queryData84.add("d_verify", "1");
		queryData84.add("d_orgid", "6BA0655351E5642F0A490D44@AdobeOrg");
		queryData84.add("d_nsid", "0");
		queryData84.add("ts", getMillisecondsSinceEpoch(-1570) /* Replaced timestamp 1598596345037 (2020-08-28T12:02:25.037000+05:30) */ );
		url84 = url84.withQuery(queryData84);
		try (Request request84 = getWebBrowser().createRequest(HttpMethod.GET, url84, 84))
		{
			request84.setHeader("Content-Type", "application/x-www-form-urlencoded");
			request84.setHeader("Origin", "https://www.keysight.com");
			request84.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 84

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 84

			try (Response response84 = request84.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 84

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 84

				// Request: 84, GET, https://dpm.demdex.net/id/rd?d_visid_ver=4.6.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_verify=1&d_orgid=6BA0655351E5642F0A490D44%40AdobeOrg&d_nsid=0&ts=1598596345037, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[82]

				// Rule: Verify that the result code matches what was recorded
				response84.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 98, GET, https://agilenttechnologies.tt.omtrdc.net/m2/agilenttechnologies/mbox/json?mbox=target-global-mbox&mboxSession=47f76b9ee29b4336970bb7bd0941e0e1&mboxPC=&mboxPage=18e1d978c9e645f481c900bef8fa97b2&mboxRid=10535ea44a18448ebd9d0806f894bbab&mboxVersion=1.3.0&mboxCount=1&mboxTime=1598616146722&mboxHost=www.keysight.com&mboxURL=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html&mboxReferrer=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html&browserHeight=356&browserWidth=835&browserTimeOffset=330&screenHeight=1024&screenWidth=1821&colorDepth=24&mboxMCSDID=4C9882DD57E4A50F-688AF108F8CFC297&vst.trk=metrics.keysight.com&vst.trks=smetrics.keysight.com&mboxMCGVID=10179588773231593744477580279709953543&mboxAAMB=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[99, 100, 101, 102]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		Url url98 = new Url(protocol1, agilenttechnologies, "/m2/agilenttechnologies/mbox/json");
		QueryData queryData98 = new QueryData();
		queryData98.add("mbox", "target-global-mbox");
		queryData98.add("mboxSession", "47f76b9ee29b4336970bb7bd0941e0e1");
		queryData98.add("mboxPC", "");
		queryData98.add("mboxPage", "18e1d978c9e645f481c900bef8fa97b2");
		queryData98.add("mboxRid", "10535ea44a18448ebd9d0806f894bbab");
		queryData98.add("mboxVersion", "1.3.0");
		queryData98.add("mboxCount", "1");
		queryData98.add("mboxTime", "1598616146722");
		queryData98.add("mboxHost", "www.keysight.com");
		queryData98.add("mboxURL", "https://www.keysight.com/in/en/home.html");
		queryData98.add("mboxReferrer", getWebBrowser().getCookieValue(keysight.host(), "/", "_sdsat_traffic_source") );
		queryData98.add("browserHeight", "356");
		queryData98.add("browserWidth", "835");
		queryData98.add("browserTimeOffset", "330");
		queryData98.add("screenHeight", "1024");
		queryData98.add("screenWidth", "1821");
		queryData98.add("colorDepth", "24");
		queryData98.add("mboxMCSDID", "4C9882DD57E4A50F-688AF108F8CFC297");
		queryData98.add("vst.trk", "metrics.keysight.com");
		queryData98.add("vst.trks", "smetrics.keysight.com");
		queryData98.add("mboxMCGVID", "10179588773231593744477580279709953543");
		queryData98.add("mboxAAMB", "RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y");
		url98 = url98.withQuery(queryData98);
		try (Request request98 = getWebBrowser().createRequest(HttpMethod.GET, url98, 98))
		{
			request98.setHeader("Origin", "https://www.keysight.com");
			request98.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 98

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 98

			try (Response response98 = request98.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 98

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 98

				// Rule: Verify that the result code matches what was recorded
				response98.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 111, GET, https://agilent.demdex.net/dest5.html?d_nsid=0, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[109, 110]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Page Title: Adobe AudienceManager
		// Cookie(s) sent from client:
		// demdex=10343804049503213874492851632238412194
		// Cookie(s) set by server:
		//  Secure;SameSite=None;
		//  demdex=10343804049503213874492851632238412194; Domain=.demdex.net; expires=Wed, 24-Feb-2021 06:32:30 GMT; Max-Age=15552000; Path=/;
		Url url111 = new Url(protocol1, agilent, "/dest5.html");
		QueryData queryData111 = new QueryData();
		queryData111.add("d_nsid", "0");
		url111 = url111.withQuery(queryData111);
		try (Request request111 = getWebBrowser().createRequest(HttpMethod.GET, url111, 111))
		{
			request111.setHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*");
			request111.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 111

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 111

			try (Response response111 = request111.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 111

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 111

				// Rule: Verify that the page title matches what was recorded
				response111.verifyTitle("Adobe AudienceManager", ActionType.ACT_WARNING);
				// Rule: Verify that the result code matches what was recorded
				response111.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 121, GET, https://agilent.demdex.net/dest5.html?d_nsid=0, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[120]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Page Title: Adobe AudienceManager
		// Cookie(s) sent from client:
		// demdex=10343804049503213874492851632238412194
		// Cookie(s) set by server:
		//  Secure;SameSite=None;
		//  demdex=10343804049503213874492851632238412194; Domain=.demdex.net; expires=Wed, 24-Feb-2021 06:32:33 GMT; Max-Age=15552000; Path=/;
		Url url121 = new Url(protocol1, agilent, "/dest5.html");
		QueryData queryData121 = new QueryData();
		queryData121.add("d_nsid", "0");
		url121 = url121.withQuery(queryData121);
		try (Request request121 = getWebBrowser().createRequest(HttpMethod.GET, url121, 121))
		{
			request121.setHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*");
			request121.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request121.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 121

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 121

			try (Response response121 = request121.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 121

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 121

				// Rule: Verify that the page title matches what was recorded
				response121.verifyTitle("Adobe AudienceManager", ActionType.ACT_WARNING);
				// Rule: Verify that the result code matches what was recorded
				response121.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 139, POST, https://www.keysight.com/akam/11/pixel_4980da9d, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[137, 138]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plwbIPbQcai7EKjFAJXSQK0Wr8T
		// ciTwz/Um5ANDBgnWk9XYFizQhtkPmif3l53lLrO5vwkMUOYrXDCrpqckG2s6Gt/gtu71J0emE6HXqFetPBbYD8/ZZu1a2Qt/9O2B
		// 1JYk+LDe7quLn78jqHGU7rrj5PUS3Bmr9VxMvQm/Y7EtIxXQG0M27/Hz2wg0C4Na8S7ma15cTg50gUHOfc2iCr/I1FG3JeNu+K1K
		// TvLRGNbk2vlF1hnKHkEXrQBzwVjTVlcDtk5n+PGRsaIJ3XaekSlYzCn2lZBv6wXQMD61fGhowmqzy3jvmmghnWKs2L/Fdo78l3Td
		// hyCibRH/4a3q3S47w==
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUGxQaYAFqUYo+23OO236bSiI6HGz3y2wyw9JJZz5Th6n5ZSj2uxl7dN
		// 4CT0Q5e9GI=
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444
		// 77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18510%7CvVersion%7C4.6.0
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  check=true
		//  mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#1598598210|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150
		//  s_ecid=MCMID%7C10179588773231593744477580279709953543
		//  cookies=cookies
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596345023
		//  _sdsat_session_count=1
		//  _sdsat_lt_pages_viewed=1
		//  _sdsat_pages_viewed=1
		//  _sdsat_traffic_source=https://www.keysight.com/us/en/home.html
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D04
		// 0CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F
		// 7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  referrer=Web%20Link%20Referrals
		// Cookie(s) set by server:
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plmY5avVAUO/PK1fRPRuGFTG7x5u57zffSV5vf1uWo29C0WNwCjcxfGBYNe5U7PMgng9O6DlhFltI304WzG5hQI+4Pig1awcuZcZ5BbgOJyJgRgYupKPNV/nMkELz2w/d8PKZyixUzQUiMKNdAbwmO1aen6uVRF9B9w99DdJTm3x/BBCcWmAtGY27RMWPugbmsU4AF5dxSHZ3ZQzLsZaJObMLA/hJnyw9cZgDdliA/5joLeNO2DPpybcTE36qxjizD; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:22 GMT; Max-Age=7187; Path=/;
		Url url139 = new Url(protocol1, keysight, "/akam/11/pixel_4980da9d");
		try (Request request139 = getWebBrowser().createRequest(HttpMethod.POST, url139, 139))
		{
			request139.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request139.setHeader("Content-Type", "application/x-www-form-urlencoded");
			request139.setHeader("CSRF-Token", "undefined");
			request139.setHeader("DNT", "1");
			request139.setHeader("Cache-Control", "no-cache");
			Form postData139 = new Form();
			postData139.setCharEncoding("ISO-8859-1");
			postData139.addElement(new InputElement("ap", "false", "ISO-8859-1"));
			postData139.addElement(new InputElement("bt", "0", "ISO-8859-1"));
			postData139.addElement(new InputElement("fonts", "3,4,5,6,7,9,12,13,22,52,53,54,60,61,62,63,64,65", "ISO-8859-1"));
			postData139.addElement(new InputElement("fh", "c70f08a0923edbb1dabb0be5de78d62c59b463a2", "ISO-8859-1"));
			postData139.addElement(new InputElement("timing", "{\"1\":47,\"2\":314,\"3\":402,\"4\":476,\"5\":560,\"profile\":{\"bp\":13,\"sr\":1,\"dp\":1,\"lt\":0,"
				 + "\"ps\":0,\"cv\":12,\"fp\":0,\"sp\":0,\"br\":1,\"ieps\":0,\"av\":0,\"z1\":16,\"jsv\":1,\"nav\":2,\"nap\":0"
				 + ",\"crc\":0,\"z2\":0,\"z3\":1,\"z4\":1,\"z5\":0,\"fonts\":64},\"main\":7044,\"compute\":47,\"send\":624}", "ISO-8859-1"));
			postData139.addElement(new InputElement("bp", "2061571092,569694456,-2025032320,1544259781", "ISO-8859-1"));
			postData139.addElement(new InputElement("sr", "{\"inner\":[835,356],\"outer\":[854,480],\"screen\":[230,230],\"pageOffset\":[0,0],\"avail\":[1821,967]"
				 + ",\"size\":[1821,1024],\"client\":[811,4629],\"colorDepth\":24,\"pixelDepth\":24}", "ISO-8859-1"));
			postData139.addElement(new InputElement("dp", "{\"XDomainRequest\":0,\"createPopup\":0,\"removeEventListener\":1,\"globalStorage\":0,\"openDatabase\":0"
				 + ",\"indexedDB\":0,\"attachEvent\":0,\"dispatchEvent\":1,\"addBehavior\":0,\"addEventListener\":1,\"detachEvent\":0"
				 + ",\"fireEvent\":0,\"MutationObserver\":1,\"HTMLMenuItemElement\":0,\"Int8Array\":1,\"postMessage\":1,"
				 + "\"querySelector\":1,\"getElementsByClassName\":1,\"images\":1,\"compatMode\":\"CSS1Compat\",\"documentMode\":11"
				 + ",\"all\":1,\"now\":1,\"contextMenu\":0}", "ISO-8859-1"));
			postData139.addElement(new InputElement("lt", getMillisecondsSinceEpoch(-3329) /* Replaced timestamp 1598596351389 (2020-08-28T12:02:31.389000+05:30) */ + "+5.5", "ISO-8859-1"));
			postData139.addElement(new InputElement("ps", "true,true", "ISO-8859-1"));
			postData139.addElement(new InputElement("cv", "092f308d2d3db7132de9f541243015e05ee0b2a7", "ISO-8859-1"));
			postData139.addElement(new InputElement("fp", "32.0.0", "ISO-8859-1"));
			postData139.addElement(new InputElement("sp", "1.0,2.0,3.0,4.0,5.0", "ISO-8859-1"));
			postData139.addElement(new InputElement("br", "IE", "ISO-8859-1"));
			postData139.addElement(new InputElement("ieps", "false", "ISO-8859-1"));
			postData139.addElement(new InputElement("av", "false", "ISO-8859-1"));
			postData139.addElement(new InputElement("z", "{\"a\":1233181012,\"b\":0,\"c\":0}", "ISO-8859-1"));
			postData139.addElement(new InputElement("zh", "", "ISO-8859-1"));
			postData139.addElement(new InputElement("jsv", "1.3", "ISO-8859-1"));
			postData139.addElement(new InputElement("nav", "{\"userAgent\":\"Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; .NET4.0C; .NET4.0E; .NET CLR"
				 + " 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; wbx 1.0.0; rv:11.0) like Gecko\",\"appName\":\"Netscape\",\"appCodeName\":\"Mozilla\",\"appVersion\":\"5.0"
				 + " (Windows NT 10.0; WOW64; Trident/7.0; Touch; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729;"
				 + " .NET CLR 3.5.30729; wbx 1.0.0; rv:11.0) like Gecko\",\"appMinorVersion\":\"0\",\"product\":\"Gecko\",\"productSub\":0,\"vendor\":\"\",\"vendorSub"
				 + "\":0,\"buildID\":0,\"platform\":\"Win32\",\"oscpu\":0,\"hardwareConcurrency\":0,\"language\":\"en-US"
				 + "\",\"languages\":0,\"systemLanguage\":\"en-US\",\"userLanguage\":\"en-US\",\"doNotTrack\":0,\"msDoNo"
				 + "tTrack\":0,\"cookieEnabled\":true,\"geolocation\":1,\"vibrate\":0,\"maxTouchPoints\":10,\"webdriver"
				 + "\":false,\"plugins\":[\"Shockwave Flash\",\"Silverlight Plug-In\"]}", "ISO-8859-1"));
			postData139.addElement(new InputElement("nap", "6", "ISO-8859-1"));
			postData139.addElement(new InputElement("crc", "{\"window.chrome\":\"-not-existent\"}", "ISO-8859-1"));
			postData139.addElement(new InputElement("t", "1658925ec8a6dca8077cd48ca7eb498fbafaf414", "ISO-8859-1"));
			postData139.addElement(new InputElement("u", "9608cc4ff4c15475a1c9a4e91894ad00", "ISO-8859-1"));
			postData139.addElement(new InputElement("fc", "true", "ISO-8859-1"));
			request139.setMessageBody(postData139);

			// #region EPP_BEFORE_REQUEST_SENT for Request 139

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 139

			try (Response response139 = request139.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 139

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 139

				// Rule: Verify that the result code matches what was recorded
				response139.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 145, POST, https://www.google-analytics.com/j/collect?v=1&_v=j83&a=1658265066&t=pageview&_s=1&dl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html&ul=en-us&de=utf-8&dt=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight&sd=24-bit&sr=1821x1024&vp=811x356&je=1&fl=32.0%20r0&_u=IEBAAIQAAAAAAC~&jid=1512268413&gjid=1930780363&cid=1689172026.1598596353&tid=UA-48088400-1&_gid=416552926.1598596353&_r=1&z=2145490675, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// All POST requests are top level
		// ====================================================================================================================================
		Url url145 = new Url(protocol1, google_analytics, "/j/collect");
		QueryData queryData145 = new QueryData();
		queryData145.add("v", "1");
		queryData145.add("_v", "j83");
		queryData145.add("a", "1658265066");
		queryData145.add("t", "pageview");
		queryData145.add("_s", "1");
		queryData145.add("dl", "https://www.keysight.com/in/en/home.html");
		queryData145.add("ul", "en-us");
		queryData145.add("de", "utf-8");
		queryData145.add("dt", "Electronic design, test automation & measurement equipment | Keysight");
		queryData145.add("sd", "24-bit");
		queryData145.add("sr", "1821x1024");
		queryData145.add("vp", "811x356");
		queryData145.add("je", "1");
		queryData145.add("fl", "32.0 r0");
		queryData145.add("_u", "IEBAAIQAAAAAAC~");
		queryData145.add("jid", "1512268413");
		queryData145.add("gjid", "1930780363");
		queryData145.add("cid", "1689172026.1598596353");
		queryData145.add("tid", "UA-48088400-1");
		queryData145.add("_gid", "416552926.1598596353");
		queryData145.add("_r", "1");
		queryData145.add("z", "2145490675");
		url145 = url145.withQuery(queryData145);
		try (Request request145 = getWebBrowser().createRequest(HttpMethod.POST, url145, 145))
		{
			request145.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request145.setHeader("Content-Type", "text/plain");
			request145.setHeader("Origin", "https://www.keysight.com");
			request145.setHeader("DNT", "1");
			request145.setHeader("Cache-Control", "no-cache");
			String postDataString145 = "";
			request145.setMessageBody(postDataString145);

			// #region EPP_BEFORE_REQUEST_SENT for Request 145

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 145

			try (Response response145 = request145.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 145

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 145

				// Rule: Verify that the result code matches what was recorded
				response145.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 146, GET, https://t.co/i/adsct?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=o1agt&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tw_document_href=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		Url url146 = new Url(protocol1, t, "/i/adsct");
		QueryData queryData146 = new QueryData();
		queryData146.add("type", "javascript");
		queryData146.add("version", "1.1.0");
		queryData146.add("p_id", "Twitter");
		queryData146.add("p_user_id", "0");
		queryData146.add("txn_id", "o1agt");
		queryData146.add("events", "[[\"pageview\",null]]");
		queryData146.add("tw_sale_amount", "0");
		queryData146.add("tw_order_quantity", "0");
		queryData146.add("tw_iframe_status", "0");
		queryData146.add("tw_document_href", "https://www.keysight.com/in/en/home.html");
		url146 = url146.withQuery(queryData146);
		try (Request request146 = getWebBrowser().createRequest(HttpMethod.GET, url146, 146))
		{
			request146.setHeader("Accept", "image/png, image/svg+xml, image/jxr, image/*;q=0.8, */*;q=0.5");
			request146.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request146.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 146

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 146

			try (Response response146 = request146.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 146

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 146

				// Rule: Verify that the result code matches what was recorded
				response146.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 150, GET, https://analytics.twitter.com/i/adsct?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=o1agt&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tpx_cb=twttr.conversion.loadPixels&tw_document_href=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[151]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Cookie(s) set by server:
		//  SameSite=None;
		//  personalization_id="v1_DxTRKTu+TUYII5YjLxNycQ=="; Domain=.twitter.com; expires=Sun, 28 Aug 2022 06:32:39 GMT; Max-Age=63072000; Path=/;
		Url url150 = new Url(protocol1, analytics, "/i/adsct");
		QueryData queryData150 = new QueryData();
		queryData150.add("type", "javascript");
		queryData150.add("version", "1.1.0");
		queryData150.add("p_id", "Twitter");
		queryData150.add("p_user_id", "0");
		queryData150.add("txn_id", "o1agt");
		queryData150.add("events", "[[\"pageview\",null]]");
		queryData150.add("tw_sale_amount", "0");
		queryData150.add("tw_order_quantity", "0");
		queryData150.add("tw_iframe_status", "0");
		queryData150.add("tpx_cb", "twttr.conversion.loadPixels");
		queryData150.add("tw_document_href", "https://www.keysight.com/in/en/home.html");
		url150 = url150.withQuery(queryData150);
		try (Request request150 = getWebBrowser().createRequest(HttpMethod.GET, url150, 150))
		{
			request150.setHeader("Accept", "application/javascript, */*;q=0.8");
			request150.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request150.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 150

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 150

			try (Response response150 = request150.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 150

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 150

				// Rule: Verify that the result code matches what was recorded
				response150.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 154, GET, https://s609785623.t.eloqua.com/visitor/v200/svrGP?pps=3&siteid=609785623&ref2=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html&tzo=-330&ms=498&optin=disabled, response code=302 Found, redirect occurred, overlapping top-level requests:[], other overlapping requests:[]
		// ====================================================================================================================================
		Url url155 = new Url(protocol1, s609785623, "/visitor/v200/svrGP");
		QueryData queryData155 = new QueryData();
		queryData155.add("pps", "3");
		queryData155.add("siteid", "609785623");
		queryData155.add("ref2", getWebBrowser().getCookieValue(keysight.host(), "/", "_sdsat_traffic_source") );
		queryData155.add("tzo", "-330");
		queryData155.add("ms", "498");
		queryData155.add("optin", "disabled");
		url155 = url155.withQuery(queryData155);
		try (Request request155 = getWebBrowser().createRequest(HttpMethod.GET, url155, 155))
		{
			request155.setHeader("Accept", "image/png, image/svg+xml, image/jxr, image/*;q=0.8, */*;q=0.5");
			request155.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request155.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 155

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 155

			try (Response response155 = request155.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 155

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 155

				// Request: 155, GET, https://s609785623.t.eloqua.com/visitor/v200/svrGP.aspx?pps=3&siteid=609785623&ref2=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html&tzo=-330&ms=498&optin=disabled&elqCookie=1, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[156]

				// Rule: Verify that the result code matches what was recorded
				response155.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 157, POST, https://stats.g.doubleclick.net/j/collect?t=dc&aip=1&_r=3&v=1&_v=j83&tid=UA-48088400-1&cid=1689172026.1598596353&jid=1512268413&gjid=1930780363&_gid=416552926.1598596353&_u=IEBAAIAAAAAAAC~&z=1395987418, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// All POST requests are top level
		// ====================================================================================================================================
		Url url157 = new Url(protocol1, stats, "/j/collect");
		QueryData queryData157 = new QueryData();
		queryData157.add("t", "dc");
		queryData157.add("aip", "1");
		queryData157.add("_r", "3");
		queryData157.add("v", "1");
		queryData157.add("_v", "j83");
		queryData157.add("tid", "UA-48088400-1");
		queryData157.add("cid", "1689172026.1598596353");
		queryData157.add("jid", "1512268413");
		queryData157.add("gjid", "1930780363");
		queryData157.add("_gid", "416552926.1598596353");
		queryData157.add("_u", "IEBAAIAAAAAAAC~");
		queryData157.add("z", "1395987418");
		url157 = url157.withQuery(queryData157);
		try (Request request157 = getWebBrowser().createRequest(HttpMethod.POST, url157, 157))
		{
			request157.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request157.setHeader("Content-Type", "text/plain");
			request157.setHeader("Origin", "https://www.keysight.com");
			request157.setHeader("DNT", "1");
			request157.setHeader("Cache-Control", "no-cache");
			String postDataString157 = "";
			request157.setMessageBody(postDataString157);

			// #region EPP_BEFORE_REQUEST_SENT for Request 157

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 157

			try (Response response157 = request157.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 157

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 157

				// Rule: Verify that the result code matches what was recorded
				response157.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 167, POST, https://outlook.office365.com/mapi/nspi/?MailboxId=f610406a-cea6-4776-b1b3-a37d3b71b630@keysight.com, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[162, 163, 168, 169]
		// All POST requests are top level
		// ====================================================================================================================================
		getWebBrowser().saveCookie(outlook.host(), "MapiContext=MAPIAAAAAOGsmcmbqp3QkqOQoJW2hLSGtpurk76MuZmpm6GUo5msnsTn1u7Y79zt1OfR4S4AAAAAAAAA");
		getWebBrowser().saveCookie(outlook.host(), "MapiRouting=UlVNOjI2NzAwM2Q3LWZiOGQtNGRjNS05ZDdmLTY1OWY1N2UzZGEzODqb/tYNG0vYCA==");
		getWebBrowser().saveCookie(outlook.host(), "MapiSequence=474-nbWQMw==");
		// Cookie(s) sent from client:
		// MapiContext=MAPIAAAAAOGsmcmbqp3QkqOQoJW2hLSGtpurk76MuZmpm6GUo5msnsTn1u7Y79zt1OfR4S4AAAAAAAAA
		// MapiRouting=UlVNOjI2NzAwM2Q3LWZiOGQtNGRjNS05ZDdmLTY1OWY1N2UzZGEzODqb/tYNG0vYCA==
		// MapiSequence=474-nbWQMw==
		// Cookie(s) set by server:
		//  MapiContext=MAPIAAAAAOGsmcmbqp3QkqOQoJW2hLSGtpurk76MuZmpm6GUo5msnsTn1u7Y79zt1OfR4S4AAAAAAAAA; Path=/mapi/;
		//  MapiRouting=UlVNOjI2NzAwM2Q3LWZiOGQtNGRjNS05ZDdmLTY1OWY1N2UzZGEzODqb/tYNG0vYCA==; Path=/mapi/;
		Url url167 = new Url(protocol1, outlook, "/mapi/nspi/");
		QueryData queryData167 = new QueryData();
		queryData167.add("MailboxId", "f610406a-cea6-4776-b1b3-a37d3b71b630@keysight.com");
		url167 = url167.withQuery(queryData167);
		try (Request request167 = getWebBrowser().createRequest(HttpMethod.POST, url167, 167))
		{
			request167.setHeader("Accept", "application/mapi-http");
			request167.setHeader("User-Agent", "Microsoft Office/16.0 (Windows NT 10.0; Microsoft Outlook 16.0.11929; Pro)");
			request167.setHeader("Cache-Control", "no-cache");
			request167.setHeader("Pragma", "no-cache");
			request167.setHeader("Content-Type", "application/mapi-http");
			request167.setHeader("X-MS-CookieUri-Requested", "t");
			request167.setHeader("X-FeatureVersion", "1");
			request167.setHeader("Client-Request-Id", "{412C2969-2772-4778-B42F-E0B52589D550}");
			request167.setHeader("X-User-Identity", "sudipta.das@keysight.com");
			request167.setHeader("X-MS-Negotiate", "Server");
			request167.setHeader("X-ClientApplication", "Outlook/16.0.11929.20836");
			request167.setHeader("X-ClientInfo", "{ED40DC77-1F54-49DD-ACE9-8C864742932D}:168320010");
			request167.setHeader("X-RequestId", "{06B4563A-8E72-4A32-A682-85C4F1DF2E43}:965");
			request167.setHeader("X-RequestType", "PING");
			String postDataString167 = "";
			request167.setMessageBody(postDataString167);

			// #region EPP_BEFORE_REQUEST_SENT for Request 167

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 167

			try (Response response167 = request167.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 167

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 167

				// Rule: Verify that the result code matches what was recorded
				response167.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}
		getWebBrowser().saveCookie(keysight.host(), "Form=false");
		getWebBrowser().saveCookie(keysight.host(), "Video=false");
		getWebBrowser().saveCookie(keysight.host(), "s_sq=%5B%5BB%5D%5D");

		// ====================================================================================================================================
		// Request: 174, GET, https://www.keysight.com/en/pc-1000000231%3Aepsg%3Apgr/function-arbitrary-waveform-generators?nid=-536902257.0.00&lc=eng&cc=US, response code=301 Moved Permanently, redirect occurred, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_lt_pages_viewed=2");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_pages_viewed=2");
		// Page Title: Waveform and Function Generators | Keysight
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plmY5avVAUO/PK1fRPRuGFTG7x5
		// u57zffSV5vf1uWo29C0WNwCjcxfGBYNe5U7PMgng9O6DlhFltI304WzG5hQI+4Pig1awcuZcZ5BbgOJyJgRgYupKPNV/nMkELz2w
		// /d8PKZyixUzQUiMKNdAbwmO1aen6uVRF9B9w99DdJTm3x/BBCcWmAtGY27RMWPugbmsU4AF5dxSHZ3ZQzLsZaJObMLA/hJnyw9cZ
		// gDdliA/5joLeNO2DPpybcTE36qxjizD
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUGxQaYAFqUYo+23OO236bSiI6HGz3y2wyw9JJZz5Th6n5ZSj2uxl7dN
		// 4CT0Q5e9GI=
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444
		// 77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18510%7CvVersion%7C4.6.0
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  check=true
		//  mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#1598598210|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150
		//  s_ecid=MCMID%7C10179588773231593744477580279709953543
		//  cookies=cookies
		//  s_cc=true
		//  _ga=GA1.2.1689172026.1598596353
		//  _gid=GA1.2.416552926.1598596353
		//  _gat_43b0a442b086b5e859d5435951d9b278=1
		//  _fbp=fb.1.1598596355048.1423242099
		//  s_sq=%5B%5BB%5D%5D
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596345023
		//  _sdsat_session_count=1
		//  _sdsat_lt_pages_viewed=1
		//  _sdsat_pages_viewed=1
		//  _sdsat_traffic_source=https://www.keysight.com/us/en/home.html
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D04
		// 0CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F
		// 7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  referrer=Web%20Link%20Referrals
		//  Has Initiated Form=false
		//  Has Viewed Video=false
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOV6U3VDQDFGDLyrDEQ2D1NxGTwto8R5za1g7fq2ozbcvaida+oUybgK8CjLdzHeRVY=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url176 = new Url(protocol1, keysight, "/en/pc-1000000231%3Aepsg%3Apgr/function-arbitrary-waveform-generators");
		QueryData queryData176 = new QueryData();
		queryData176.add("nid", "-536902257.0.00");
		queryData176.add("lc", "eng");
		queryData176.add("cc", "US");
		url176 = url176.withQuery(queryData176);
		try (Request request176 = getWebBrowser().createRequest(HttpMethod.GET, url176, 176))
		{
			request176.setHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*");
			request176.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request176.setHeader("DNT", "1");
			request176_ProcessSubRequests(request176);

			// #region EPP_BEFORE_REQUEST_SENT for Request 176

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 176

			try (Response response176 = request176.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 176

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 176

				// Request: 175, GET, https://www.keysight.com/us/en/products/waveform-and-function-generators.html, response code=302 Found, redirect occurred, overlapping top-level requests:[], other overlapping requests:[]
				// Request: 176, GET, https://www.keysight.com/in/en/products/waveform-and-function-generators.html, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]

				// Rule: Verify that the page title matches what was recorded
				response176.verifyTitle("Waveform and Function Generators | Keysight", ActionType.ACT_WARNING);
				// Rule: Verify that the result code matches what was recorded
				response176.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 204, GET, https://www.keysight.com/libs/granite/csrf/token.json, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[195, 196, 197, 198, 199, 200, 201, 202, 203, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plmY5avVAUO/PK1fRPRuGFTG7x5
		// u57zffSV5vf1uWo29C0WNwCjcxfGBYNe5U7PMgng9O6DlhFltI304WzG5hQI+4Pig1awcuZcZ5BbgOJyJgRgYupKPNV/nMkELz2w
		// /d8PKZyixUzQUiMKNdAbwmO1aen6uVRF9B9w99DdJTm3x/BBCcWmAtGY27RMWPugbmsU4AF5dxSHZ3ZQzLsZaJObMLA/hJnyw9cZ
		// gDdliA/5joLeNO2DPpybcTE36qxjizD
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOV6U3VDQDFGDLyrDEQ2D1NxGTwto8R5za1g7fq2ozbcvaida+oUybgK8
		// CjLdzHeRVY=
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444
		// 77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18510%7CvVersion%7C4.6.0
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  check=true
		//  mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#1598598210|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150
		//  s_ecid=MCMID%7C10179588773231593744477580279709953543
		//  cookies=cookies
		//  s_cc=true
		//  _ga=GA1.2.1689172026.1598596353
		//  _gid=GA1.2.416552926.1598596353
		//  _gat_43b0a442b086b5e859d5435951d9b278=1
		//  _fbp=fb.1.1598596355048.1423242099
		//  s_sq=%5B%5BB%5D%5D
		//  dtCookie=9405A6400A323C1552A12F0C9D4D7E9A|d3d3LmtleXNpZ2h0LmNvbXwx
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596345023
		//  _sdsat_session_count=1
		//  _sdsat_lt_pages_viewed=1
		//  _sdsat_pages_viewed=1
		//  _sdsat_traffic_source=https://www.keysight.com/us/en/home.html
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D04
		// 0CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F
		// 7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  referrer=Web%20Link%20Referrals
		//  Has Initiated Form=false
		//  Has Viewed Video=false
		//  JSESSIONIDA=Ug8zxMF720cQUMuWLI6Es57NmKhQ8HueqYof9-sBiHbYBxqpG-aA!-1800569623
		//  _stky=1
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOWXFY2JntsPdVUKiKoUsO58VrjX/t6yRaW71DbdnH0T2q4fTLG8VoOlR1lhVL4PoOc=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url204 = new Url(protocol1, keysight, "/libs/granite/csrf/token.json");
		try (Request request204 = getWebBrowser().createRequest(HttpMethod.GET, url204, 204))
		{
			request204.setHeader("DNT", "1");
			request204_ProcessSubRequests(request204);

			// #region EPP_BEFORE_REQUEST_SENT for Request 204

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 204

			try (Response response204 = request204.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 204

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 204

				// Rule: Verify that the result code matches what was recorded
				response204.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 236, GET, https://agilenttechnologies.tt.omtrdc.net/m2/agilenttechnologies/mbox/json?mbox=target-global-mbox&mboxSession=47f76b9ee29b4336970bb7bd0941e0e1&mboxPC=47f76b9ee29b4336970bb7bd0941e0e1.31_0&mboxPage=0c4608587c9946048337c2e69e950c00&mboxRid=83452f546ffe431394d89f0cd3d50563&mboxVersion=1.3.0&mboxCount=1&mboxTime=1598616171397&mboxHost=www.keysight.com&mboxURL=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html&mboxReferrer=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html&browserHeight=356&browserWidth=835&browserTimeOffset=330&screenHeight=1024&screenWidth=1821&colorDepth=24&mboxMCSDID=1E4F425CD84E98DC-10D1B33258E25A81&vst.trk=metrics.keysight.com&vst.trks=smetrics.keysight.com&mboxMCGVID=10179588773231593744477580279709953543&mboxAAMB=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&mboxMCGLH=12, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[232, 233, 234, 235, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		Url url236 = new Url(protocol1, agilenttechnologies, "/m2/agilenttechnologies/mbox/json");
		QueryData queryData236 = new QueryData();
		queryData236.add("mbox", "target-global-mbox");
		queryData236.add("mboxSession", "47f76b9ee29b4336970bb7bd0941e0e1");
		queryData236.add("mboxPC", "47f76b9ee29b4336970bb7bd0941e0e1.31_0");
		queryData236.add("mboxPage", "0c4608587c9946048337c2e69e950c00");
		queryData236.add("mboxRid", "83452f546ffe431394d89f0cd3d50563");
		queryData236.add("mboxVersion", "1.3.0");
		queryData236.add("mboxCount", "1");
		queryData236.add("mboxTime", "1598616171397");
		queryData236.add("mboxHost", "www.keysight.com");
		queryData236.add("mboxURL", "https://www.keysight.com/in/en/products/waveform-and-function-generators.html");
		queryData236.add("mboxReferrer", "https://www.keysight.com/in/en/home.html");
		queryData236.add("browserHeight", "356");
		queryData236.add("browserWidth", "835");
		queryData236.add("browserTimeOffset", "330");
		queryData236.add("screenHeight", "1024");
		queryData236.add("screenWidth", "1821");
		queryData236.add("colorDepth", "24");
		queryData236.add("mboxMCSDID", "1E4F425CD84E98DC-10D1B33258E25A81");
		queryData236.add("vst.trk", "metrics.keysight.com");
		queryData236.add("vst.trks", "smetrics.keysight.com");
		queryData236.add("mboxMCGVID", "10179588773231593744477580279709953543");
		queryData236.add("mboxAAMB", "RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y");
		queryData236.add("mboxMCGLH", "12");
		url236 = url236.withQuery(queryData236);
		try (Request request236 = getWebBrowser().createRequest(HttpMethod.GET, url236, 236))
		{
			request236.setHeader("Origin", "https://www.keysight.com");
			request236.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 236

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 236

			try (Response response236 = request236.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 236

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 236

				// Rule: Verify that the result code matches what was recorded
				response236.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 277, GET, https://analytics.twitter.com/i/adsct?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=o1agt&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tpx_cb=twttr.conversion.loadPixels&tw_document_href=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html, response code=200 OK, overlapping top-level requests:[278], other overlapping requests:[267, 270, 271, 279, 280]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// personalization_id="v1_DxTRKTu+TUYII5YjLxNycQ=="
		Url url277 = new Url(protocol1, analytics, "/i/adsct");
		QueryData queryData277 = new QueryData();
		queryData277.add("type", "javascript");
		queryData277.add("version", "1.1.0");
		queryData277.add("p_id", "Twitter");
		queryData277.add("p_user_id", "0");
		queryData277.add("txn_id", "o1agt");
		queryData277.add("events", "[[\"pageview\",null]]");
		queryData277.add("tw_sale_amount", "0");
		queryData277.add("tw_order_quantity", "0");
		queryData277.add("tw_iframe_status", "0");
		queryData277.add("tpx_cb", "twttr.conversion.loadPixels");
		queryData277.add("tw_document_href", "https://www.keysight.com/in/en/products/waveform-and-function-generators.html");
		url277 = url277.withQuery(queryData277);
		try (Request request277 = getWebBrowser().createRequest(HttpMethod.GET, url277, 277))
		{
			request277.setHeader("Accept", "application/javascript, */*;q=0.8");
			request277.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 277

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 277

			try (Response response277 = request277.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 277

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 277

				// Rule: Verify that the result code matches what was recorded
				response277.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 278, GET, https://t.co/i/adsct?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=o1agt&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tw_document_href=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html, response code=200 OK, overlapping top-level requests:[277], other overlapping requests:[267, 270, 271, 279, 280]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		Url url278 = new Url(protocol1, t, "/i/adsct");
		QueryData queryData278 = new QueryData();
		queryData278.add("type", "javascript");
		queryData278.add("version", "1.1.0");
		queryData278.add("p_id", "Twitter");
		queryData278.add("p_user_id", "0");
		queryData278.add("txn_id", "o1agt");
		queryData278.add("events", "[[\"pageview\",null]]");
		queryData278.add("tw_sale_amount", "0");
		queryData278.add("tw_order_quantity", "0");
		queryData278.add("tw_iframe_status", "0");
		queryData278.add("tw_document_href", "https://www.keysight.com/in/en/products/waveform-and-function-generators.html");
		url278 = url278.withQuery(queryData278);
		try (Request request278 = getWebBrowser().createRequest(HttpMethod.GET, url278, 278))
		{
			request278.setHeader("Accept", "image/png, image/svg+xml, image/jxr, image/*;q=0.8, */*;q=0.5");
			request278.setReferer(new Url(protocol1, keysight, "/in/en/products/waveform-and-function-generators.html"));
			request278.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 278

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 278

			try (Response response278 = request278.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 278

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 278

				// Rule: Verify that the result code matches what was recorded
				response278.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 282, GET, https://www.keysight.com/in/en/contact.html, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		getWebBrowser().saveCookie(keysight.host(), "mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#" + getSecondsSinceEpoch(1858) /* Replaced timestamp 1598598234 (2020-08-28T12:33:54+05:30) */ + "|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150");
		getWebBrowser().saveCookie(keysight.host(), "s_sq=agilentcom%3D%2526c.%2526a.%2526activitymap.%2526page%253D%25252Fproducts%25252Fwaveform-and-fu"
			 + "nction-generators.html%2526link%253DContact%252520Us%2526region%253Dutil-contacts%2526pageIDType%253"
			 + "D1%2526.activitymap%2526.a%2526.c%2526pid%253D%25252Fproducts%25252Fwaveform-and-function-generators"
			 + ".html%2526pidt%253D1%2526oid%253Dhttps%25253A%25252F%25252F" + keysight.host() + "%25252Fin%25252Fen%25252Fcontact.html%2526ot%253DA%2526oi%253D150");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_lt_pages_viewed=3");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_pages_viewed=3");
		getWebBrowser().saveCookie(smetrics.host(), "mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#" + getSecondsSinceEpoch(1858) /* Replaced timestamp 1598598234 (2020-08-28T12:33:54+05:30) */ + "|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150");
		// Page Title: Contact Us | Keysight
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plmY5avVAUO/PK1fRPRuGFTG7x5
		// u57zffSV5vf1uWo29C0WNwCjcxfGBYNe5U7PMgng9O6DlhFltI304WzG5hQI+4Pig1awcuZcZ5BbgOJyJgRgYupKPNV/nMkELz2w
		// /d8PKZyixUzQUiMKNdAbwmO1aen6uVRF9B9w99DdJTm3x/BBCcWmAtGY27RMWPugbmsU4AF5dxSHZ3ZQzLsZaJObMLA/hJnyw9cZ
		// gDdliA/5joLeNO2DPpybcTE36qxjizD
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOWXFY2JntsPdVUKiKoUsO58VrjX/t6yRaW71DbdnH0T2q4fTLG8VoOlR
		// 1lhVL4PoOc=
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444
		// 77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18510%7CvVersion%7C4.6.0
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  check=true
		//  mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#1598598234|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150
		//  s_ecid=MCMID%7C10179588773231593744477580279709953543
		//  cookies=cookies
		//  s_cc=true
		//  _ga=GA1.2.1689172026.1598596353
		//  _gid=GA1.2.416552926.1598596353
		//  _gat_43b0a442b086b5e859d5435951d9b278=1
		//  _fbp=fb.1.1598596355048.1423242099
		//  s_sq=agilentcom%3D%2526c.%2526a.%2526activitymap.%2526page%253D%25252Fproducts%25252Fwaveform-and-fu
		// nction-generators.html%2526link%253DContact%252520Us%2526region%253Dutil-contacts%2526pageIDType%253
		// D1%2526.activitymap%2526.a%2526.c%2526pid%253D%25252Fproducts%25252Fwaveform-and-function-generators
		// .html%2526pidt%253D1%2526oid%253Dhttps%25253A%25252F%25252Fwww.keysight.com%25252Fin%25252Fen%25252F
		// contact.html%2526ot%253DA%2526oi%253D150
		//  dtCookie=9405A6400A323C1552A12F0C9D4D7E9A|d3d3LmtleXNpZ2h0LmNvbXwx
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596345023
		//  _sdsat_session_count=1
		//  _sdsat_lt_pages_viewed=2
		//  _sdsat_pages_viewed=2
		//  _sdsat_traffic_source=https://www.keysight.com/us/en/home.html
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D04
		// 0CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F
		// 7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  referrer=Web%20Link%20Referrals
		//  Has Initiated Form=false
		//  Has Viewed Video=false
		//  JSESSIONIDA=Ug8zxMF720cQUMuWLI6Es57NmKhQ8HueqYof9-sBiHbYBxqpG-aA!-1800569623
		//  _stky=1
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOWtCHzC32UD0WYnLb3zjrZDQ4bqmaw8aEOqLdMJCgT58CEI3etFIePem5uGPEdQtZ0=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url282 = new Url(protocol1, keysight, "/in/en/contact.html");
		try (Request request282 = getWebBrowser().createRequest(HttpMethod.GET, url282, 282))
		{
			request282.setHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*");
			request282.setReferer(new Url(protocol1, keysight, "/in/en/products/waveform-and-function-generators.html"));
			request282.setHeader("DNT", "1");
			request282_ProcessSubRequests(request282);

			// #region EPP_BEFORE_REQUEST_SENT for Request 282

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 282

			try (Response response282 = request282.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 282

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 282

				// Rule: Verify that the page title matches what was recorded
				response282.verifyTitle("Contact Us | Keysight", ActionType.ACT_WARNING);
				// Rule: Verify that the result code matches what was recorded
				response282.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 338, GET, https://www.keysight.com/libs/granite/csrf/token.json, response code=200 OK, overlapping top-level requests:[357], other overlapping requests:[329, 330, 331, 332, 333, 334, 335, 336, 337, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plmY5avVAUO/PK1fRPRuGFTG7x5
		// u57zffSV5vf1uWo29C0WNwCjcxfGBYNe5U7PMgng9O6DlhFltI304WzG5hQI+4Pig1awcuZcZ5BbgOJyJgRgYupKPNV/nMkELz2w
		// /d8PKZyixUzQUiMKNdAbwmO1aen6uVRF9B9w99DdJTm3x/BBCcWmAtGY27RMWPugbmsU4AF5dxSHZ3ZQzLsZaJObMLA/hJnyw9cZ
		// gDdliA/5joLeNO2DPpybcTE36qxjizD
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOWtCHzC32UD0WYnLb3zjrZDQ4bqmaw8aEOqLdMJCgT58CEI3etFIePem
		// 5uGPEdQtZ0=
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444
		// 77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18510%7CvVersion%7C4.6.0
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  check=true
		//  mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#1598598234|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150
		//  s_ecid=MCMID%7C10179588773231593744477580279709953543
		//  cookies=cookies
		//  s_cc=true
		//  _ga=GA1.2.1689172026.1598596353
		//  _gid=GA1.2.416552926.1598596353
		//  _gat_43b0a442b086b5e859d5435951d9b278=1
		//  _fbp=fb.1.1598596355048.1423242099
		//  s_sq=agilentcom%3D%2526c.%2526a.%2526activitymap.%2526page%253D%25252Fproducts%25252Fwaveform-and-fu
		// nction-generators.html%2526link%253DContact%252520Us%2526region%253Dutil-contacts%2526pageIDType%253
		// D1%2526.activitymap%2526.a%2526.c%2526pid%253D%25252Fproducts%25252Fwaveform-and-function-generators
		// .html%2526pidt%253D1%2526oid%253Dhttps%25253A%25252F%25252Fwww.keysight.com%25252Fin%25252Fen%25252F
		// contact.html%2526ot%253DA%2526oi%253D150
		//  dtCookie=9405A6400A323C1552A12F0C9D4D7E9A|d3d3LmtleXNpZ2h0LmNvbXwx
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596345023
		//  _sdsat_session_count=1
		//  _sdsat_lt_pages_viewed=2
		//  _sdsat_pages_viewed=2
		//  _sdsat_traffic_source=https://www.keysight.com/us/en/home.html
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D04
		// 0CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F
		// 7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  referrer=Web%20Link%20Referrals
		//  Has Initiated Form=false
		//  Has Viewed Video=false
		//  JSESSIONIDA=Ug8zxMF720cQUMuWLI6Es57NmKhQ8HueqYof9-sBiHbYBxqpG-aA!-1800569623
		//  _stky=1
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUH3StDrxd7A6YR1F2b+KBvlycy9itGHyHQ8obcbJYSBxlGF41g+Meoi5u2SJJP8kc=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url338 = new Url(protocol1, keysight, "/libs/granite/csrf/token.json");
		try (Request request338 = getWebBrowser().createRequest(HttpMethod.GET, url338, 338))
		{
			request338.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 338

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 338

			try (Response response338 = request338.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 338

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 338

				// Rule: Verify that the result code matches what was recorded
				response338.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 357, GET, https://agilenttechnologies.tt.omtrdc.net/m2/agilenttechnologies/mbox/json?mbox=target-global-mbox&mboxSession=47f76b9ee29b4336970bb7bd0941e0e1&mboxPC=47f76b9ee29b4336970bb7bd0941e0e1.31_0&mboxPage=1aee3001fc704b67a177a39a9d3a9c2a&mboxRid=0f1f7e332f0e4af2868b035a958048f8&mboxVersion=1.3.0&mboxCount=1&mboxTime=1598616177072&mboxHost=www.keysight.com&mboxURL=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html&mboxReferrer=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html&browserHeight=356&browserWidth=835&browserTimeOffset=330&screenHeight=1024&screenWidth=1821&colorDepth=24&mboxMCSDID=58A8DC75FD215901-40D1A4DBD5372ECA&vst.trk=metrics.keysight.com&vst.trks=smetrics.keysight.com&mboxMCGVID=10179588773231593744477580279709953543&mboxAAMB=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&mboxMCGLH=12, response code=200 OK, overlapping top-level requests:[338], other overlapping requests:[351, 352, 353, 354, 355, 356, 358, 359]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		Url url357 = new Url(protocol1, agilenttechnologies, "/m2/agilenttechnologies/mbox/json");
		QueryData queryData357 = new QueryData();
		queryData357.add("mbox", "target-global-mbox");
		queryData357.add("mboxSession", "47f76b9ee29b4336970bb7bd0941e0e1");
		queryData357.add("mboxPC", "47f76b9ee29b4336970bb7bd0941e0e1.31_0");
		queryData357.add("mboxPage", "1aee3001fc704b67a177a39a9d3a9c2a");
		queryData357.add("mboxRid", "0f1f7e332f0e4af2868b035a958048f8");
		queryData357.add("mboxVersion", "1.3.0");
		queryData357.add("mboxCount", "1");
		queryData357.add("mboxTime", "1598616177072");
		queryData357.add("mboxHost", "www.keysight.com");
		queryData357.add("mboxURL", "https://www.keysight.com/in/en/contact.html");
		queryData357.add("mboxReferrer", "https://www.keysight.com/in/en/products/waveform-and-function-generators.html");
		queryData357.add("browserHeight", "356");
		queryData357.add("browserWidth", "835");
		queryData357.add("browserTimeOffset", "330");
		queryData357.add("screenHeight", "1024");
		queryData357.add("screenWidth", "1821");
		queryData357.add("colorDepth", "24");
		queryData357.add("mboxMCSDID", "58A8DC75FD215901-40D1A4DBD5372ECA");
		queryData357.add("vst.trk", "metrics.keysight.com");
		queryData357.add("vst.trks", "smetrics.keysight.com");
		queryData357.add("mboxMCGVID", "10179588773231593744477580279709953543");
		queryData357.add("mboxAAMB", "RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y");
		queryData357.add("mboxMCGLH", "12");
		url357 = url357.withQuery(queryData357);
		try (Request request357 = getWebBrowser().createRequest(HttpMethod.GET, url357, 357))
		{
			request357.setHeader("Origin", "https://www.keysight.com");
			request357.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 357

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 357

			try (Response response357 = request357.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 357

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 357

				// Rule: Verify that the result code matches what was recorded
				response357.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 376, GET, https://www.keysight.com/etc/keysight/api/UpdateFormCookie?productText=&cookieValue=, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[365, 369]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// AK_COUNTRY=IN
		//  ak_bmsc=D981D8F8C71C7A33D15C58D3CE4CEF09173945B3CA290000F6A4485F6B8F7229~plmY5avVAUO/PK1fRPRuGFTG7x5
		// u57zffSV5vf1uWo29C0WNwCjcxfGBYNe5U7PMgng9O6DlhFltI304WzG5hQI+4Pig1awcuZcZ5BbgOJyJgRgYupKPNV/nMkELz2w
		// /d8PKZyixUzQUiMKNdAbwmO1aen6uVRF9B9w99DdJTm3x/BBCcWmAtGY27RMWPugbmsU4AF5dxSHZ3ZQzLsZaJObMLA/hJnyw9cZ
		// gDdliA/5joLeNO2DPpybcTE36qxjizD
		//  bm_mi=45B709F61B43ADC420B6106615EC9CC5~TJ3v3oiGzWYiVei2YgET/8vEd3NmEvZ0Pbh+Ybe0p9SRMtVkAXLya2XvBrFI0
		// EZAyQO6xBdZ5ZJQCRCG32sC/aj+2tSK6T2lpeNmN1LCYSPNL7z6r7NKxmUuj4I1HAsBN+n1lS8EGV48dx6v+kEwg6kFJhJIGWJ8v
		// bBgIFYsZIEKo6nbxg7j5cwtNMTlBb16/2Owt8kP8rfBZIyhNAp5NHfiinDBUCFqo6mpAHtpU2WGgLNFMIclmCKWulNS529xmtMko
		// pakSttC6N3EJmD23t3UAswJ9jZ/lQ2Gbq3RZho=
		//  AG_LOCALE=INeng
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1
		// dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOUH3StDrxd7A6YR1F2b+KBvlycy9itGHyHQ8obcbJYSBxlGF41g+Meoi
		// 5u2SJJP8kc=
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C101795887732315937444
		// 77580279709953543%7CMCAAMLH-1599201146%7C12%7CMCAAMB-1599201146%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603547s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-18510%7CvVersion%7C4.6.0
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  check=true
		//  mbox=session#47f76b9ee29b4336970bb7bd0941e0e1#1598598234|PC#47f76b9ee29b4336970bb7bd0941e0e1.31_0#1661841150
		//  s_ecid=MCMID%7C10179588773231593744477580279709953543
		//  cookies=cookies
		//  s_cc=true
		//  _ga=GA1.2.1689172026.1598596353
		//  _gid=GA1.2.416552926.1598596353
		//  _gat_43b0a442b086b5e859d5435951d9b278=1
		//  _fbp=fb.1.1598596355048.1423242099
		//  s_sq=%5B%5BB%5D%5D
		//  dtCookie=9405A6400A323C1552A12F0C9D4D7E9A|d3d3LmtleXNpZ2h0LmNvbXwx
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596345023
		//  _sdsat_session_count=1
		//  _sdsat_lt_pages_viewed=3
		//  _sdsat_pages_viewed=3
		//  _sdsat_traffic_source=https://www.keysight.com/us/en/home.html
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F7D04
		// 0CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAAC34C2D554BBF59F
		// 7D040CE2DF67FEE250A512E43272B24B0A6548EAD52B165F2
		//  referrer=Web%20Link%20Referrals
		//  Has Initiated Form=false
		//  Has Viewed Video=false
		//  JSESSIONIDA=Ug8zxMF720cQUMuWLI6Es57NmKhQ8HueqYof9-sBiHbYBxqpG-aA!-1800569623
		//  _stky=1
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_sv=A346A592B35266F3F4A2C320340A8DC8~QxCGoKu3+F7EW3LbCmAn/7q/u99+BCLVvfQko1dPxACtPs4+JL9PStQrHYxE1dXYHMxBzmVQjzoyRlYPinyb2VxapTGNTCTRRYTWk724xOV1HwXjfwygPpovUPb3bKgV6S8u/nV5Cw4OUZHqLNyOP0V6eGdfvJho61qWSxrRUWQ=; Domain=.keysight.com; expires=Fri, 28 Aug 2020 08:32:24 GMT; Path=/;
		Url url376 = new Url(protocol1, keysight, "/etc/keysight/api/UpdateFormCookie");
		QueryData queryData376 = new QueryData();
		queryData376.add("productText", "");
		queryData376.add("cookieValue", "");
		url376 = url376.withQuery(queryData376);
		try (Request request376 = getWebBrowser().createRequest(HttpMethod.GET, url376, 376))
		{
			request376.setHeader("X-Requested-With", "XMLHttpRequest");
			request376.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 376

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 376

			try (Response response376 = request376.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 376

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 376

				// Rule: Verify that the result code matches what was recorded
				response376.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 377, GET, https://analytics.twitter.com/i/adsct?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=o1agt&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tpx_cb=twttr.conversion.loadPixels&tw_document_href=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html, response code=200 OK, overlapping top-level requests:[379], other overlapping requests:[378, 380]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		// Cookie(s) sent from client:
		// personalization_id="v1_DxTRKTu+TUYII5YjLxNycQ=="
		Url url377 = new Url(protocol1, analytics, "/i/adsct");
		QueryData queryData377 = new QueryData();
		queryData377.add("type", "javascript");
		queryData377.add("version", "1.1.0");
		queryData377.add("p_id", "Twitter");
		queryData377.add("p_user_id", "0");
		queryData377.add("txn_id", "o1agt");
		queryData377.add("events", "[[\"pageview\",null]]");
		queryData377.add("tw_sale_amount", "0");
		queryData377.add("tw_order_quantity", "0");
		queryData377.add("tw_iframe_status", "0");
		queryData377.add("tpx_cb", "twttr.conversion.loadPixels");
		queryData377.add("tw_document_href", "https://www.keysight.com/in/en/contact.html");
		url377 = url377.withQuery(queryData377);
		try (Request request377 = getWebBrowser().createRequest(HttpMethod.GET, url377, 377))
		{
			request377.setHeader("Accept", "application/javascript, */*;q=0.8");
			request377.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 377

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 377

			try (Response response377 = request377.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 377

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 377

				// Rule: Verify that the result code matches what was recorded
				response377.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 379, GET, https://t.co/i/adsct?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=o1agt&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tw_document_href=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html, response code=200 OK, overlapping top-level requests:[377], other overlapping requests:[378, 380]
		// Rule: Promote Content-Type: text/html sub-requests
		// ====================================================================================================================================
		Url url379 = new Url(protocol1, t, "/i/adsct");
		QueryData queryData379 = new QueryData();
		queryData379.add("type", "javascript");
		queryData379.add("version", "1.1.0");
		queryData379.add("p_id", "Twitter");
		queryData379.add("p_user_id", "0");
		queryData379.add("txn_id", "o1agt");
		queryData379.add("events", "[[\"pageview\",null]]");
		queryData379.add("tw_sale_amount", "0");
		queryData379.add("tw_order_quantity", "0");
		queryData379.add("tw_iframe_status", "0");
		queryData379.add("tw_document_href", "https://www.keysight.com/in/en/contact.html");
		url379 = url379.withQuery(queryData379);
		try (Request request379 = getWebBrowser().createRequest(HttpMethod.GET, url379, 379))
		{
			request379.setHeader("Accept", "image/png, image/svg+xml, image/jxr, image/*;q=0.8, */*;q=0.5");
			request379.setReferer(new Url(protocol1, keysight, "/in/en/contact.html"));
			request379.setHeader("DNT", "1");

			// #region EPP_BEFORE_REQUEST_SENT for Request 379

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 379

			try (Response response379 = request379.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 379

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 379

				// Rule: Verify that the result code matches what was recorded
				response379.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// ====================================================================================================================================
		// Request: 383, GET, https://www.keysight.com/libs/granite/csrf/token.json, response code=200 OK, overlapping top-level requests:[], other overlapping requests:[]
		// Rule: Promote Content-Type: application/json sub-requests
		// ====================================================================================================================================
		getWebBrowser().saveCookie(keysight.host(), "AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C237656579302400948522"
			 + "39246067815180323%7CMCAAMLH-1599200883%7C12%7CMCAAMB-1599200883%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH"
			 + "aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603283s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-17660%7CvVersion%7C4.6.0");
		getWebBrowser().saveCookie(keysight.host(), "AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAACDE1870DE4352B61A9F"
			 + "536DD40B59A747F7297A90ABDADA976C6121C77D73CFF");
		getWebBrowser().saveCookie(keysight.host(), "AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAACDE1870DE4352B6"
			 + "1A9F536DD40B59A747F7297A90ABDADA976C6121C77D73CFF");
		getWebBrowser().saveCookie(keysight.host(), "_fbp=fb.1.1593484981351.143300833");
		getWebBrowser().saveCookie(keysight.host(), "_ga=GA1.2.1438325380.1525152288");
		getWebBrowser().saveCookie(keysight.host(), "_gid=GA1.2.977389749.1598596085");
		getWebBrowser().saveCookie(keysight.host(), "_hjAbsoluteSessionInProgress=1");
		getWebBrowser().saveCookie(keysight.host(), "_hjid=17f77270-3db4-444e-bd42-9e550c0e1933");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_landing_page=https://" + keysight.host() + "/in/en/home.html|" + getMillisecondsSinceEpoch(-300894) /* Replaced timestamp 1598596083490 (2020-08-28T11:58:03.490000+05:30) */ + "");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_lt_pages_viewed=6");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_session_count=4");
		getWebBrowser().saveCookie(keysight.host(), "_sdsat_traffic_source=https://" + google_com.host() + "/");
		getWebBrowser().saveCookie(keysight.host(), "ak_bmsc=F5C9C1D7F47D1512C7E1EF22D517A7B9173945B3CA290000F2A3485FB3B06A27~pl5kKzBeO+mTnP+cL23V8gQzcnP"
			 + "jrYEcjYvC5Smg1jKBSAH0dA9ZYmsFbMxYMyedx4f2k+FoDL9okyqzWaw8u8tw12/rLYseYtqFgzQe5nAM5+KkpJF4Iuco6oto99C"
			 + "kNSDUWMzAb7E9LZxIYmrrNa7IqODsJ88hco+tY9NQzSvzw6IGFg90Ead4BRos1r4zx8uyuT96BazFKWhwccajyw+r+a7efWd93dB"
			 + "kW4/lJHA/L0ps6VChN3yhdEwzJkOb8E");
		getWebBrowser().saveCookie(keysight.host(), "atgRecVisitorId=115BWuIiY-7gRIltfsZWxv8SWD99sggYngd9XJCw6jIzo70F9BE");
		getWebBrowser().saveCookie(keysight.host(), "bm_mi=80530C83EDE8924D50EA6E39E3763066~TJ3v3oiGzWYiVei2YgET/zxoztcZQVCrdnZW0HEfac4o5OoxxCUmNfuRq5LGZ"
			 + "i+mC+tFak7+jeyY9RhZFwO9KQzxaxr8ViQaHl1xyJuoX2h8aMuc6GSgbYm30mkkxh7nVmOOIYRrZqhFy04lYeN7fKoUwrPe2bouc"
			 + "JTeUOYNlRT3WBxySvbyeKHjeJi2ED/XprSLIAZ3q3RHecv0aFlcl0Ev8FvxMDN4aPyJvyyuzZAwntGCQQeZaDiGlfVnTZuWbQjIw"
			 + "EbldVNFxrj/0QHT5AUZH1qsolPcut0Xt89Ygvk=");
		getWebBrowser().saveCookie(keysight.host(), "bm_sv=85FBDE3CF8A57F137D790B40F2A5CF4F~QxCGoKu3+F7EW3LbCmAn/z0ULXP1AxiFtqLqwWYPr+M4qVT9Qar+rJoV4ruS6"
			 + "YS9nN7aFLpYNeS5yu+oDWkvYSJrcy0ChgJ1smxiD+krCqaAndzIgRQaYxppSGXr3e9/S0x/PbsLUqXy2xg7upm/SkrJQkAXMgqEn"
			 + "2GswyjOHB8=");
		getWebBrowser().saveCookie(keysight.host(), "ext_name=jaehkpjddfdgiiefcnhahapilbejohhj");
		getWebBrowser().saveCookie(keysight.host(), "mbox=PC#40eb9fd2feb6461f9a1cebfb594dbe13.31_0#1656729782|session#fcf512163c1345059e0a8a70ab420880#" + getSecondsSinceEpoch(1560) /* Replaced timestamp 1598597945 (2020-08-28T12:29:05+05:30) */ + "");
		getWebBrowser().saveCookie(keysight.host(), "referrer=Web%20Organic%20Search");
		// Cookie(s) sent from client:
		// _ga=GA1.2.1438325380.1525152288
		//  atgRecVisitorId=115BWuIiY-7gRIltfsZWxv8SWD99sggYngd9XJCw6jIzo70F9BE
		//  ext_name=jaehkpjddfdgiiefcnhahapilbejohhj
		//  AG_LOCALE=INeng
		//  cookies=cookies
		//  _fbp=fb.1.1593484981351.143300833
		//  _hjid=17f77270-3db4-444e-bd42-9e550c0e1933
		//  _hjAbsoluteSessionInProgress=1
		//  AWSELB=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAACDE1870DE4352B61A9F
		// 536DD40B59A747F7297A90ABDADA976C6121C77D73CFF
		//  AWSELBCORS=65C927790A8FB8DB564E9A059781FDD52458B1FF0DE9884EC6229BAABE2AC90F298D1B5FAACDE1870DE4352B6
		// 1A9F536DD40B59A747F7297A90ABDADA976C6121C77D73CFF
		//  AK_COUNTRY=IN
		//  bm_mi=80530C83EDE8924D50EA6E39E3763066~TJ3v3oiGzWYiVei2YgET/zxoztcZQVCrdnZW0HEfac4o5OoxxCUmNfuRq5LGZ
		// i+mC+tFak7+jeyY9RhZFwO9KQzxaxr8ViQaHl1xyJuoX2h8aMuc6GSgbYm30mkkxh7nVmOOIYRrZqhFy04lYeN7fKoUwrPe2bouc
		// JTeUOYNlRT3WBxySvbyeKHjeJi2ED/XprSLIAZ3q3RHecv0aFlcl0Ev8FvxMDN4aPyJvyyuzZAwntGCQQeZaDiGlfVnTZuWbQjIw
		// EbldVNFxrj/0QHT5AUZH1qsolPcut0Xt89Ygvk=
		//  _sdsat_landing_page=https://www.keysight.com/in/en/home.html|1598596083490
		//  _sdsat_session_count=4
		//  _sdsat_lt_pages_viewed=6
		//  _sdsat_pages_viewed=1
		//  _sdsat_traffic_source=https://www.google.com/
		//  check=true
		//  AMCVS_6BA0655351E5642F0A490D44%40AdobeOrg=1
		//  AMCV_6BA0655351E5642F0A490D44%40AdobeOrg=-408604571%7CMCIDTS%7C18503%7CMCMID%7C237656579302400948522
		// 39246067815180323%7CMCAAMLH-1599200883%7C12%7CMCAAMB-1599200883%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPH
		// aMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1598603283s%7CNONE%7CMCAID%7CNONE%7CMCSYNCSOP%7C411-17660%7CvVersion%7C4.6.0
		//  bm_sv=85FBDE3CF8A57F137D790B40F2A5CF4F~QxCGoKu3+F7EW3LbCmAn/z0ULXP1AxiFtqLqwWYPr+M4qVT9Qar+rJoV4ruS6
		// YS9nN7aFLpYNeS5yu+oDWkvYSJrcy0ChgJ1smxiD+krCqaAndzIgRQaYxppSGXr3e9/S0x/PbsLUqXy2xg7upm/SkrJQkAXMgqEn
		// 2GswyjOHB8=
		//  mbox=PC#40eb9fd2feb6461f9a1cebfb594dbe13.31_0#1656729782|session#fcf512163c1345059e0a8a70ab420880#1598597945
		//  referrer=Web%20Organic%20Search
		//  _gid=GA1.2.977389749.1598596085
		//  s_cc=true
		//  ak_bmsc=F5C9C1D7F47D1512C7E1EF22D517A7B9173945B3CA290000F2A3485FB3B06A27~pl5kKzBeO+mTnP+cL23V8gQzcnP
		// jrYEcjYvC5Smg1jKBSAH0dA9ZYmsFbMxYMyedx4f2k+FoDL9okyqzWaw8u8tw12/rLYseYtqFgzQe5nAM5+KkpJF4Iuco6oto99C
		// kNSDUWMzAb7E9LZxIYmrrNa7IqODsJ88hco+tY9NQzSvzw6IGFg90Ead4BRos1r4zx8uyuT96BazFKWhwccajyw+r+a7efWd93dB
		// kW4/lJHA/L0ps6VChN3yhdEwzJkOb8E
		//  Has Viewed Video=false
		//  Has Initiated Form=false
		// Cookie(s) set by server:
		//  AK_COUNTRY=IN; Domain=.keysight.com; Path=/;
		//  bm_sv=85FBDE3CF8A57F137D790B40F2A5CF4F~QxCGoKu3+F7EW3LbCmAn/z0ULXP1AxiFtqLqwWYPr+M4qVT9Qar+rJoV4ruS6YS9nN7aFLpYNeS5yu+oDWkvYSJrcy0ChgJ1smxiD+krCqYXtONqQtWxGmmv7lLwzhcGKhXQ+GMJjwUHogtBitwI9FjhFH+bMhuo7dgGMuRHqB8=; Domain=.keysight.com; Max-Age=6898; Path=/;
		Url url383 = new Url(protocol1, keysight, "/libs/granite/csrf/token.json");
		try (Request request383 = getWebBrowser().createRequest(HttpMethod.GET, url383, 383))
		{
			request383.setHeader("Accept-Language", "en-US,en;q=0.9");
			request383.setHeader("Accept-Encoding", "gzip, deflate, br");
			request383.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.117"
				 + " Safari/537.36");
			request383.setReferer(new Url(protocol1, keysight, "/in/en/home.html"));
			request383.setHeader("Sec-Fetch-Site", "same-origin");
			request383.setHeader("Sec-Fetch-Mode", "cors");

			// #region EPP_BEFORE_REQUEST_SENT for Request 383

			// Code added here will be preserved during script regeneration

			// #endregion EPP_BEFORE_REQUEST_SENT for Request 383

			try (Response response383 = request383.send())
			{
				// #region EPP_AFTER_RESPONSE_RECEIVED for Request 383

				// Code added here will be preserved during script regeneration

				// #endregion EPP_AFTER_RESPONSE_RECEIVED for Request 383

				// Rule: Verify that the result code matches what was recorded
				response383.verifyResult(HttpStatus.OK, ActionType.ACT_WARNING);
			}
		}

		// #region EPP_BEFORE_END_TRANSACTION for Transaction "Start"

		// Code added here will be preserved during script regeneration

		// #endregion EPP_BEFORE_END_TRANSACTION for Transaction "Start"

		endTransaction("Start");

		pause(2000);
	}

	private void request2_ProcessSubRequests(Request request2) throws Exception
	{
		// Ignore these URL's when making subrequests. Either they do not appear in the recording, or they are fetched in a later request.
		request2.ignoreSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/satelliteLib-a53bebc2074176d87b972409923c7bb1d4d9b1f0.js");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/about/newsroom/Images/pathwave-design2020-images/keysight-ADS-RFPro.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/cmp/2020/promotion/MXR208A_0002_TRANS-SHAD_1600x900.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/cmp/new-products/N9021B-TRANSP-SHAD-06b_1600x900.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/common/view-all.svg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/events/ww-events/keysight-world/2020/KW2020-KW-LogoOnDark-BG.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/ind/communications/communications-card.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_aerospace-800x450.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_automotive-800x450.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_government-800x450.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_semiconductors-800x450.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_service-provider-800x450.jpg");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/N7005A_Probe2.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/oscilloscope-1200x900.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-design-700x950.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-it-700x950.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-manufacturing-700x950.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-qa-700x950.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-service-provider-700x950.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/S8708A_16x9_2.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/generators-sources-power/power-supplies/system/rp7900-series/RP7972A-FL_1600X900.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/generators-sources-power/source-measure-units/n6705c/N6705C_14_FT_TRANS-SHAD_2016Aug24.png");
		request2.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/scopes-analyzers-meters/networkanalyzer/pna/pna-x/N5245B_updated_hardware_1200x900.png");
		request2.ignoreSubRequest(protocol1, keysight, "/akam/11/pixel_4980da9d?a=dD0xNjU4OTI1ZWM4YTZkY2E4MDc3Y2Q0OGNhN2ViNDk4ZmJhZmFmNDE0JmpzPW9mZg==");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/common/customer-quote-icon.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-5g.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-aerospace-defense.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-automotive.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-cloud.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-connected-car.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-data-center.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-design-automation.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-design-software.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-education.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-emerging-tech.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-energy-ecosystem.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-enterprise.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-fundamentals.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-generators-sources-power.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-government.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-hsd-system-design.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-iot.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-manufacturing-test.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-meters.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-modular-instruments.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-security-visibility.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-security.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-test.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-visibility.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-rf-microwave.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-scopes-analyzers-meters.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-sdn-nfv-virtualization.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-semiconductor.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-service-providers.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-services.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-support.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-telecomms.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-wireless.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-facebook.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-linkedin.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-twitter.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-youtube.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/keysight-logo.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-globe.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-search-close.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-search.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/util-loggedin-active.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/util-login-active.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/util-loginrem-active.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/util-quote-active.svg");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/main.js");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/ocp.js");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/quote.js");
		request2.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/img/content/favicon.png");
		request2.ignoreSubRequest(protocol1, keysight, "/favicon.ico");
		request2.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/logintimeout-aem.js");
		request2.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/sso-auth.js");
		// References to the following page resources could not be found within the contents of the received web page.
		// This can occur because resources are fetched as a result of style sheets or the browser executing script code e.g. JavaScript.
		request2.addSubRequest(protocol1, keysight, "/content/dam/keysight/other-assets/home-personas.css"); //  Request: 5, 200 OK
	}

	private void request17_ProcessSubRequests(Request request17) throws Exception
	{
		// Ignore these URL's when making subrequests. Either they do not appear in the recording, or they are fetched in a later request.
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/about/newsroom/Images/pathwave-design2020-images/keysight-ADS-RFPro.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/cmp/2020/promotion/MXR208A_0002_TRANS-SHAD_1600x900.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/cmp/new-products/N9021B-TRANSP-SHAD-06b_1600x900.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/common/view-all.svg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/events/ww-events/keysight-world/2020/KW2020-KW-LogoOnDark-BG.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/ind/communications/communications-card.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_aerospace-800x450.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_automotive-800x450.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_government-800x450.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_semiconductors-800x450.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/industries_service-provider-800x450.jpg");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/N7005A_Probe2.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/oscilloscope-1200x900.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-design-700x950.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-it-700x950.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-manufacturing-700x950.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-qa-700x950.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-service-provider-700x950.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/S8708A_16x9_2.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/generators-sources-power/power-supplies/system/rp7900-series/RP7972A-FL_1600X900.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/generators-sources-power/source-measure-units/n6705c/N6705C_14_FT_TRANS-SHAD_2016Aug24.png");
		request17.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/scopes-analyzers-meters/networkanalyzer/pna/pna-x/N5245B_updated_hardware_1200x900.png");
		request17.ignoreSubRequest(protocol1, keysight, "/akam/11/pixel_4980da9d?a=dD0xNjU4OTI1ZWM4YTZkY2E4MDc3Y2Q0OGNhN2ViNDk4ZmJhZmFmNDE0JmpzPW9mZg==");
		request17.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/common/customer-quote-icon.svg");
		request17.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/img/content/favicon.png");
		request17.ignoreSubRequest(protocol1, keysight, "/favicon.ico");
		request17.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/logintimeout-aem.js");
		request17.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/sso-auth.js");
		// References to the following page resources could not be found within the contents of the received web page.
		// This can occur because resources are fetched as a result of style sheets or the browser executing script code e.g. JavaScript.
		request17.addSubRequest(protocol1, keysight, "/content/dam/keysight/other-assets/home-personas.css"); //  Request: 20, 304 Not Modified
		request17.addSubRequest(protocol1, polyfill, "/v2/polyfill.min.js?features=IntersectionObserver"); //  Request: 34, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/mbox-contents-c807450beb165fac72bee676825f89d246bfc623.js"); //  Request: 82, 200 OK
		request17.addSubRequest(protocol1, smetrics, "/id?d_visid_ver=4.6.0"
			 + "&d_fieldgroup=A"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&ts=" + getMillisecondsSinceEpoch(2483) /* Replaced timestamp 1598596346682 (2020-08-28T12:02:26.682000+05:30) */ + ""); //  Request: 85, 200 OK
		request17.addSubRequest(protocol1, cdn, "/my/loop11.js"); //  Request: 86, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/fb4e8319-465f-463f-96ee-1ecd750c91c6.woff"); //  Request: 87, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/648bd4af-3501-4cec-b42b-965433fc3beb.woff"); //  Request: 88, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/a4b7aeb9-bdc9-4d27-8f9a-6b7384e92533.woff"); //  Request: 89, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/5e4b1a7c-1a9e-49d9-ae18-1a732f7a2c18.woff"); //  Request: 90, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/f7681494-f333-459d-9621-b892d3142607.woff"); //  Request: 91, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/19610f9a-f118-4a96-a156-cd28dcc5c03c.woff"); //  Request: 92, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/cee82a04-b81c-42aa-82e0-b507f7a3e048.woff"); //  Request: 93, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/015aaf06-e7a3-434e-9c0d-041f2f706b17.woff"); //  Request: 94, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/47b9f157-32a5-4905-a5a0-7b9f99614f03.woff"); //  Request: 95, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/1fae1263-7236-47a3-8614-2b38feeaad62.woff"); //  Request: 96, 200 OK
		request17.addSubRequest(protocol1, cm, "/cm/dd?d_uuid=10343804049503213874492851632238412194"); //  Request: 97, 302 Found
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/0d9d1013-2259-4a34-908a-9dd717cfe203.woff"); //  Request: 99, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/d9c842f8-b37a-414f-be86-97ea9c61d3d7.woff"); //  Request: 100, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/3bae17e1-9437-4f28-9c07-cb474607e608.woff"); //  Request: 101, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/adc6aa68-bc12-4c1f-932f-2b6fb09f15aa.woff"); //  Request: 102, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-share.svg"); //  Request: 103, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-facebook-white.svg"); //  Request: 104, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-linkedin-white.svg"); //  Request: 105, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-twitter-white.svg"); //  Request: 106, 200 OK
		request17.addSubRequest(protocol1, googletagmanager, "/gtag/js?id=AW-1067248536"); //  Request: 107, 200 OK
		request17.addSubRequest(protocol1, script_, "/pages/scripts/0084/1642.js"); //  Request: 108, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-5c95054f64746d755b0021e3.js"); //  Request: 110, 200 OK
		request17.addSubRequest(protocol1, connect, "/en_US/fbevents.js"); //  Request: 112, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-5e31218f64746d59250029d5.js"); //  Request: 113, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/s-code-contents-454637b186413ce1615c2f3aba6b721f553ae4c4.js"); //  Request: 114, 200 OK
		request17.addSubRequest(protocol1, snap, "/li.lms-analytics/insight.min.js"); //  Request: 115, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/s-code-contents-b13acc0178d19bea60686e7234b24e6327ab4019.js"); //  Request: 116, 200 OK
		request17.addSubRequest(protocol1, static_, "/uwt.js"); //  Request: 117, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-5e2e818f64746d7b07000ad1.js"); //  Request: 118, 200 OK
		request17.addSubRequest(protocol1, ssl, "/analytics.js"); //  Request: 119, 200 OK
		request17.addSubRequest(protocol1, script_, "/pages/versioned/common-scripts/11.1.68.js"); //  Request: 120, 200 OK
		request17.addSubRequest(protocol1, googleadservices, "/pagead/conversion_async.js"); //  Request: 122, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-service-provider-700x950.png?wid=270"
			 + "&fmt=png-alpha"); //  Request: 123, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-it-700x950.png?wid=270"
			 + "&fmt=png-alpha"); //  Request: 124, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/events/ww-events/keysight-world/2020/KW2020-KW-LogoOnDark-BG.png?wid=368"
			 + "&fmt=png-alpha"); //  Request: 125, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-qa-700x950.png?wid=270"
			 + "&fmt=png-alpha"); //  Request: 126, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-design-700x950.png?wid=270"
			 + "&fmt=png-alpha"); //  Request: 127, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/oscilloscope-1200x900.png?wid=368"
			 + "&fmt=png-alpha"); //  Request: 128, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/5G-Resource-Library-2000x400.jpg?wid=811"); //  Request: 129, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/banner-homepage-KU-2000x800_v3.jpg?wid=811"); //  Request: 130, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/HeroBanner_KW_2000x800.png?wid=811"
			 + "&fmt=png-alpha"); //  Request: 131, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/common/customer-quote-icon.svg?wid=100"); //  Request: 132, 403 Forbidden
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/personas-manufacturing-700x950.png?wid=270"
			 + "&fmt=png-alpha"); //  Request: 133, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/panelbg-red-2_2000x800.jpg?wid=811"); //  Request: 134, 200 OK
		request17.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/home/purple-background.jpg?wid=811"); //  Request: 135, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-carousel-arrow.svg"); //  Request: 136, 200 OK
		request17.addSubRequest(protocol1, connect, "/signals/config/399413163752712?v=2.9.23"
			 + "&r=stable"); //  Request: 137, 200 OK
		request17.addSubRequest(protocol1, youtube, "/iframe_api"); //  Request: 138, 200 OK
		request17.addSubRequest(protocol1, img, "/i/elqCfg.min.js"); //  Request: 140, 200 OK
		request17.addSubRequest(protocol1, smetrics, "/b/ss/ktkeysitecomprod/1/JS-2.17.0-D7QN/s84148304156952?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A32%205%20-330"
			 + "&sdid=4C9882DD57E4A50F-688AF108F8CFC297"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=%2Fhome.html"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&r=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html"
			 + "&server=AEM"
			 + "&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y"
			 + "&c1=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&h1=Worldwide%20Home%2F%2F%2F"
			 + "&c3=home"
			 + "&c4=None"
			 + "&c5=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&c7=10179588773231593744477580279709953543"
			 + "&c8=None"
			 + "&c10=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&c13=Not%20Logged%20In"
			 + "&c15=IN"
			 + "&c16=eng"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&c24=KS%20Home%20Page"
			 + "&v43=No%20Business%20Unit%20Set"
			 + "&v44=No%20Campaign%20Set"
			 + "&v46=No%20Product%20Category%20Set"
			 + "&v47=No%20Product%20Form%20Factor%20Set"
			 + "&v73=10179588773231593744477580279709953543"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&AQE=1"); //  Request: 141, 200 OK
		request17.addSubRequest(protocol1, smetrics, "/b/ss/agilentcom/1/JS-2.17.0-D7QN/s8331710361227?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A32%205%20-330"
			 + "&sdid=4C9882DD57E4A50F-688AF108F8CFC297"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=KS%20Home%20Page"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&r=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html"
			 + "&server=AEM"
			 + "&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y"
			 + "&c1=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&h1=Worldwide%20Home%2F%2F%2F"
			 + "&c2=home"
			 + "&c10=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&c13=Not%20Logged%20In"
			 + "&c15=IN"
			 + "&c16=eng"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&v73=10179588773231593744477580279709953543"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&AQE=1"); //  Request: 142, 200 OK
		request17.addSubRequest(protocol1, px, "/collect?v=2"
			 + "&fmt=js"
			 + "&pid=1728329"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&time=" + getMillisecondsSinceEpoch(7918) /* Replaced timestamp 1598596352117 (2020-08-28T12:02:32.117000+05:30) */ + ""); //  Request: 143, 302 Found
		request17.addSubRequest(protocol1, googleads, "/pagead/viewthroughconversion/1067248536/?random=" + getMillisecondsSinceEpoch(9370) /* Replaced timestamp 1598596353569 (2020-08-28T12:02:33.569000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(9370) /* Replaced timestamp 1598596353569 (2020-08-28T12:02:33.569000+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&resp=GooglemKTybQhCsO"
			 + "&eid=376635470"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=1"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&ig=1"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html"
			 + "&tiba=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&hn=www.googleadservices.com"
			 + "&async=1"
			 + "&rfmt=3"
			 + "&fmt=4"); //  Request: 148, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-arrow-right.svg"); //  Request: 149, 200 OK
		request17.addSubRequest(protocol1, s, "/yts/jsbin/www-widgetapi-vfl8j36hl/www-widgetapi.js"); //  Request: 151, 200 OK
		request17.addSubRequest(protocol1, facebook, "/tr/?id=399413163752712"
			 + "&ev=PageView"
			 + "&dl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&rl=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html"
			 + "&if=false"
			 + "&ts=" + getMillisecondsSinceEpoch(10850) /* Replaced timestamp 1598596355049 (2020-08-28T12:02:35.049000+05:30) */ + ""
			 + "&sw=1821"
			 + "&sh=1024"
			 + "&v=2.9.23"
			 + "&r=stable"
			 + "&ec=0"
			 + "&o=13"
			 + "&fbp=fb.1.1598596355048.1423242099"
			 + "&it=" + getMillisecondsSinceEpoch(7140) /* Replaced timestamp 1598596351339 (2020-08-28T12:02:31.339000+05:30) */ + ""
			 + "&coo=false"
			 + "&rqm=GET"); //  Request: 152, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-flyout-hover.svg"); //  Request: 153, 200 OK
		request17.addSubRequest(protocol1, google, "/pagead/1p-user-list/1067248536/?random=" + getMillisecondsSinceEpoch(9370) /* Replaced timestamp 1598596353569 (2020-08-28T12:02:33.569000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(-1944199) /* Replaced timestamp 1598594400000 (2020-08-28T11:30:00+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&eid=376635470"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=1"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html"
			 + "&tiba=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&async=1"
			 + "&fmt=3"
			 + "&is_vtc=1"
			 + "&random=1364708489"
			 + "&resp=GooglemKTybQhCsO"
			 + "&rmt_tld=1"
			 + "&ipr=y"); //  Request: 158, 200 OK
		request17.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-flyout.svg"); //  Request: 159, 200 OK
		request17.addSubRequest(protocol1, google_com, "/pagead/1p-user-list/1067248536/?random=" + getMillisecondsSinceEpoch(9370) /* Replaced timestamp 1598596353569 (2020-08-28T12:02:33.569000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(-1944199) /* Replaced timestamp 1598594400000 (2020-08-28T11:30:00+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&eid=376635470"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=1"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fus%2Fen%2Fhome.html"
			 + "&tiba=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&async=1"
			 + "&fmt=3"
			 + "&is_vtc=1"
			 + "&random=1364708489"
			 + "&resp=GooglemKTybQhCsO"
			 + "&rmt_tld=0"
			 + "&ipr=y"); //  Request: 160, 200 OK
		request17.addSubRequest(protocol1, google, "/ads/ga-audiences?t=sr"
			 + "&aip=1"
			 + "&_r=4"
			 + "&slf_rd=1"
			 + "&v=1"
			 + "&_v=j83"
			 + "&tid=UA-48088400-1"
			 + "&cid=1689172026.1598596353"
			 + "&jid=1512268413"
			 + "&_u=IEBAAIAAAAAAAC~"
			 + "&z=481684776"); //  Request: 161, 200 OK
		request17.addSubRequest(protocol1, google_com, "/ads/ga-audiences?t=sr"
			 + "&aip=1"
			 + "&_r=4"
			 + "&slf_rd=1"
			 + "&v=1"
			 + "&_v=j83"
			 + "&tid=UA-48088400-1"
			 + "&cid=1689172026.1598596353"
			 + "&jid=1512268413"
			 + "&_u=IEBAAIAAAAAAAC~"
			 + "&z=481684776"); //  Request: 162, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-5a82a23e64746d5e3b000b94.js"); //  Request: 164, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-589bb9d664746d118700730f.js"); //  Request: 165, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-58a364c164746d20120075a3.js"); //  Request: 166, 200 OK
		request17.addSubRequest(protocol1, js_agent, "/nr-1026.min.js"); //  Request: 168, 200 OK
		request17.addSubRequest(protocol1, consent, "/notice?domain=keysight.com"
			 + "&c=teconsent"
			 + "&country=IN"); //  Request: 169, 200 OK
		request17.addSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/scripts/satellite-5dd7ac7164746d1049002cf5.js"); //  Request: 171, 200 OK
		request17.addSubRequest(protocol1, smetrics, "/b/ss/agilentcom/1/JS-2.17.0-D7QN/s85489599068581?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A45%205%20-330"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=%2Fhome.html"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&v1=IN"
			 + "&v2=eng"
			 + "&v4=Home%20Page"
			 + "&c5=D%3Dv9"
			 + "&v8=Not%20Logged%20In"
			 + "&v10=KS%20Home%20Page%7C"
			 + "&v13=https%3A%2F%2Fwww.keysight.com%2Fen%2Fpc-1000000231%253Aepsg%253Apgr%2Ffunction-arbitrary-waveform-generators%3Fnid%3D-536902257.0.00%26lc%3Deng%26cc%3DUS"
			 + "&v15=KS%20Home%20Page"
			 + "&v17=No%20Product%20Line%20Number%20Set"
			 + "&c19=Electronic%20design%2C%20test%20automation%20%26%20measurement%20equipment%20%7C%20Keysight"
			 + "&c20=00%26lc%3Deng%26cc%3DUS"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&v26=KS%20Home%20Page"
			 + "&v52=Not%20Set"
			 + "&v55=10179588773231593744477580279709953543"
			 + "&v56=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&v57=Fri%2C%2028%20Aug%202020%2006%3A32%3A45%20GMT"
			 + "&v73=10179588773231593744477580279709953543"
			 + "&c74=Fri%2C%2028%20Aug%202020%2006%3A32%3A45%20GMT"
			 + "&c75=2.17.0"
			 + "&pe=lnk_o"
			 + "&pev2=Waveform%20and%20Function%20Generators"
			 + "&c."
			 + "&a."
			 + "&activitymap."
			 + "&page=KS%20Home%20Page"
			 + "&link=Products%20%2B%20Services"
			 + "&region=gnavbar"
			 + "&pageIDType=1"
			 + "&.activitymap"
			 + "&.a"
			 + "&.c"
			 + "&pid=KS%20Home%20Page"
			 + "&pidt=1"
			 + "&oid=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts.html"
			 + "&ot=A"
			 + "&oi=286"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&lrt=4637"
			 + "&AQE=1"); //  Request: 172, 200 OK
		request17.addSubRequest(protocol1, smetrics, "/b/ss/ktkeysitecomprod/1/JS-2.17.0-D7QN/s88156236530043?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A45%205%20-330"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=%2Fhome.html"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&events=event13%3D1%2Cevent8"
			 + "&v4=Home%20Page"
			 + "&v11=00%26lc%3Deng%26cc%3DUS"
			 + "&v13=https%3A%2F%2Fwww.keysight.com%2Fen%2Fpc-1000000231%253Aepsg%253Apgr%2Ffunction-arbitrary-waveform-generators%3Fnid%3D-536902257.0.00%26lc%3Deng%26cc%3DUS"
			 + "&v17=No%20Product%20Line%20Number%20Set"
			 + "&v56=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&pe=lnk_o"
			 + "&pev2=Waveform%20and%20Function%20Generators"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&lrt=4103"
			 + "&AQE=1"); //  Request: 173, 200 OK
	}

	private void request174_ProcessSubRequests(Request request174) throws Exception
	{
		// Ignore these URL's when making subrequests. Either they do not appear in the recording, or they are fetched in a later request.
		request174.ignoreSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/satelliteLib-4eb8502d8fcf9758f2989faeaa8b9f9bcf305deb.js");
		request174.ignoreSubRequest(protocol1, keysight, "/dt/dtagent61_bxjnpr2s3t_8479.js");
		request174.ignoreSubRequest(protocol1, keysight, "/main/eucServlet?cc=IN"
			 + "&lc=eng");
	}

	private void request176_ProcessSubRequests(Request request176) throws Exception
	{
		// Ignore these URL's when making subrequests. Either they do not appear in the recording, or they are fetched in a later request.
		request176.ignoreSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/satelliteLib-a53bebc2074176d87b972409923c7bb1d4d9b1f0.js");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/cmp/pathwave/2Laptop for pathwave_benchvue.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/33600A-TRANSP-SHAD-01_1600x900.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/33600A-TRANSP-SHAD-06_1600x900.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/Front-33210A_transparent_npx_1600x900.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/function-generator-hero-group-shot_2019.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/handheld.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/scopes-analyzers-meters/oscilloscopes/company-on-worldmap_trans_1600x900.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/services/keysightcare/KeysightCare_800x450_2 (002).png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/software/BenchLink-Waveform-Builder-Pro-Software-1600x900.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/software/command-expert_800x450.png");
		request176.ignoreSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/shared-resources/demos/trueform-generator-product-spotlight-video.png");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-5g.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-aerospace-defense.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-automotive.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-cloud.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-connected-car.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-data-center.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-design-automation.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-education.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-emerging-tech.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-energy-ecosystem.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-enterprise.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-fundamentals.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-government.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-hsd-system-design.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-iot.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-manufacturing-test.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-meters.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-security-visibility.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-security.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-test.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-network-visibility.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-rf-microwave.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-sdn-nfv-virtualization.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-semiconductor.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-service-providers.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-services.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-support.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-telecomms.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-wireless.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-facebook.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-linkedin.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-twitter.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-youtube.svg");
		request176.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/img/content/favicon.png");
		request176.ignoreSubRequest(protocol1, keysight, "/favicon.ico");
		request176.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/logintimeout-aem.js");
		request176.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/sso-auth.js");
		// References to the following page resources could not be found within the contents of the received web page.
		// This can occur because resources are fetched as a result of style sheets or the browser executing script code e.g. JavaScript.
		request176.addSubRequest(protocol1, polyfill, "/v2/polyfill.min.js?features=IntersectionObserver"); //  Request: 195, 304 Not Modified
		request176.addSubRequest(protocol1, cdn, "/my/loop11.js"); //  Request: 230, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/648bd4af-3501-4cec-b42b-965433fc3beb.woff"); //  Request: 231, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/content/dam/keysight/other-assets/npxstyles.css"); //  Request: 232, 200 OK
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/a4b7aeb9-bdc9-4d27-8f9a-6b7384e92533.woff"); //  Request: 237, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/5e4b1a7c-1a9e-49d9-ae18-1a732f7a2c18.woff"); //  Request: 242, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/0d9d1013-2259-4a34-908a-9dd717cfe203.woff"); //  Request: 245, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/3bae17e1-9437-4f28-9c07-cb474607e608.woff"); //  Request: 246, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/d9c842f8-b37a-414f-be86-97ea9c61d3d7.woff"); //  Request: 247, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/adc6aa68-bc12-4c1f-932f-2b6fb09f15aa.woff"); //  Request: 248, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/f7681494-f333-459d-9621-b892d3142607.woff"); //  Request: 249, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/19610f9a-f118-4a96-a156-cd28dcc5c03c.woff"); //  Request: 250, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/cee82a04-b81c-42aa-82e0-b507f7a3e048.woff"); //  Request: 251, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/015aaf06-e7a3-434e-9c0d-041f2f706b17.woff"); //  Request: 252, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/47b9f157-32a5-4905-a5a0-7b9f99614f03.woff"); //  Request: 253, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/1fae1263-7236-47a3-8614-2b38feeaad62.woff"); //  Request: 254, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/fb4e8319-465f-463f-96ee-1ecd750c91c6.woff"); //  Request: 255, 304 Not Modified
		request176.addSubRequest(protocol1, googleads, "/pagead/viewthroughconversion/1067248536/?random=" + getMillisecondsSinceEpoch(3009) /* Replaced timestamp 1598596372161 (2020-08-28T12:02:52.161000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(3009) /* Replaced timestamp 1598596372161 (2020-08-28T12:02:52.161000+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&resp=GooglemKTybQhCsO"
			 + "&eid=376635471"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=2"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&ig=1"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&tiba=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&hn=www.googleadservices.com"
			 + "&async=1"
			 + "&rfmt=3"
			 + "&fmt=4"); //  Request: 256, 200 OK
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-twitter-white.svg"); //  Request: 257, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-linkedin-white.svg"); //  Request: 258, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-facebook-white.svg"); //  Request: 259, 304 Not Modified
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-share.svg"); //  Request: 260, 304 Not Modified
		request176.addSubRequest(protocol1, static_, "/uwt.js"); //  Request: 261, 304 Not Modified
		request176.addSubRequest(protocol1, px, "/collect?v=2"
			 + "&fmt=js"
			 + "&pid=1728329"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&time=" + getMillisecondsSinceEpoch(3336) /* Replaced timestamp 1598596372488 (2020-08-28T12:02:52.488000+05:30) */ + ""); //  Request: 262, 302 Found
		request176.addSubRequest(protocol1, google_analytics, "/collect?v=1"
			 + "&_v=j83"
			 + "&a=1531684323"
			 + "&t=pageview"
			 + "&_s=1"
			 + "&dl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&ul=en-us"
			 + "&de=utf-8"
			 + "&dt=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&sd=24-bit"
			 + "&sr=1821x1024"
			 + "&vp=811x356"
			 + "&je=1"
			 + "&fl=32.0%20r0"
			 + "&_u=AACAAAQ~"
			 + "&jid="
			 + "&gjid="
			 + "&cid=1689172026.1598596353"
			 + "&tid=UA-48088400-1"
			 + "&_gid=416552926.1598596353"
			 + "&z=891360779"); //  Request: 263, 200 OK
		request176.addSubRequest(protocol1, google_com, "/pagead/1p-user-list/1067248536/?random=" + getMillisecondsSinceEpoch(3009) /* Replaced timestamp 1598596372161 (2020-08-28T12:02:52.161000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(-1969152) /* Replaced timestamp 1598594400000 (2020-08-28T11:30:00+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&eid=376635471"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=2"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&tiba=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&async=1"
			 + "&fmt=3"
			 + "&is_vtc=1"
			 + "&random=2947474442"
			 + "&resp=GooglemKTybQhCsO"
			 + "&rmt_tld=0"
			 + "&ipr=y"); //  Request: 264, 200 OK
		request176.addSubRequest(protocol1, google, "/pagead/1p-user-list/1067248536/?random=" + getMillisecondsSinceEpoch(3009) /* Replaced timestamp 1598596372161 (2020-08-28T12:02:52.161000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(-1969152) /* Replaced timestamp 1598594400000 (2020-08-28T11:30:00+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&eid=376635471"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=2"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&tiba=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&async=1"
			 + "&fmt=3"
			 + "&is_vtc=1"
			 + "&random=2947474442"
			 + "&resp=GooglemKTybQhCsO"
			 + "&rmt_tld=1"
			 + "&ipr=y"); //  Request: 265, 200 OK
		request176.addSubRequest(protocol1, facebook, "/tr/?id=399413163752712"
			 + "&ev=PageView"
			 + "&dl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&rl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&if=false"
			 + "&ts=" + getMillisecondsSinceEpoch(3482) /* Replaced timestamp 1598596372634 (2020-08-28T12:02:52.634000+05:30) */ + ""
			 + "&sw=1821"
			 + "&sh=1024"
			 + "&v=2.9.23"
			 + "&r=stable"
			 + "&ec=0"
			 + "&o=13"
			 + "&fbp=" + getWebBrowser().getCookieValue(smetrics.host(), "/", "_fbp") + ""
			 + "&it=" + getMillisecondsSinceEpoch(3366) /* Replaced timestamp 1598596372518 (2020-08-28T12:02:52.518000+05:30) */ + ""
			 + "&coo=false"
			 + "&rqm=GET"); //  Request: 266, 200 OK
		request176.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/33600A-TRANSP-SHAD-06_1600x900.png?wid=368"
			 + "&fmt=png-alpha"); //  Request: 267, 200 OK
		request176.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/handheld.png?wid=103"
			 + "&fmt=png-alpha"); //  Request: 268, 200 OK
		request176.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/shared-resources/demos/trueform-generator-product-spotlight-video.png?wid=368"
			 + "&fmt=png-alpha"); //  Request: 269, 200 OK
		request176.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/bg-wave-purple-2000x800.jpg?wid=811"); //  Request: 270, 200 OK
		request176.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/prd/npx-function-generators/function-generator-hero-group-shot_2019.png?wid=364"
			 + "&fmt=png-alpha"); //  Request: 271, 200 OK
		request176.addSubRequest(protocol1, youtube, "/iframe_api"); //  Request: 272, 200 OK
		request176.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-video-play.svg"); //  Request: 273, 200 OK
		request176.addSubRequest(protocol1, smetrics, "/b/ss/agilentcom/1/JS-2.17.0-D7QN/s87032713276770?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A52%205%20-330"
			 + "&sdid=1E4F425CD84E98DC-10D1B33258E25A81"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=Waveform%20and%20Function%20Generators"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&r=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&server=AEM"
			 + "&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y"
			 + "&c1=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&h1=Worldwide%20Home%2FProducts%20Page%2Fwaveform-and-function-generators%2F"
			 + "&c2=products"
			 + "&c10=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&c13=Not%20Logged%20In"
			 + "&c15=IN"
			 + "&c16=eng"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&v73=D%3Dmid"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&AQE=1"); //  Request: 274, 200 OK
		request176.addSubRequest(protocol1, smetrics, "/b/ss/ktkeysitecomprod/1/JS-2.17.0-D7QN/s88551286972821?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A52%205%20-330"
			 + "&sdid=1E4F425CD84E98DC-10D1B33258E25A81"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&r=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&server=AEM"
			 + "&events=event13%3D1"
			 + "&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y"
			 + "&c1=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&h1=Worldwide%20Home%2FProducts%20Page%2Fwaveform-and-function-generators%2F"
			 + "&c3=products"
			 + "&c4=None"
			 + "&c5=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&c7=10179588773231593744477580279709953543"
			 + "&c8=waveform-and-function-generators"
			 + "&c10=Waveform%20and%20Function%20Generators%20%7C%20Keysight"
			 + "&c11=Assessment"
			 + "&c13=Not%20Logged%20In"
			 + "&c15=IN"
			 + "&c16=eng"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&c24=Waveform%20and%20Function%20Generators"
			 + "&v43=No%20Business%20Unit%20Set"
			 + "&v44=No%20Campaign%20Set"
			 + "&v46=No%20Product%20Category%20Set"
			 + "&v47=No%20Product%20Form%20Factor%20Set"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&AQE=1"); //  Request: 275, 200 OK
		request176.addSubRequest(protocol1, img, "/i/elqCfg.min.js"); //  Request: 276, 200 OK
		request176.addSubRequest(protocol1, s609785623, "/visitor/v200/svrGP?pps=3"
			 + "&siteid=609785623"
			 + "&ref2=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fhome.html"
			 + "&tzo=-330"
			 + "&ms=401"
			 + "&optin=disabled"); //  Request: 280, 200 OK
		request176.addSubRequest(protocol1, consent, "/notice?domain=keysight.com"
			 + "&c=teconsent"
			 + "&country=IN"); //  Request: 281, 200 OK
	}

	private void request204_ProcessSubRequests(Request request204) throws Exception
	{
		// References to the following page resources could not be found within the contents of the received web page.
		// This can occur because resources are fetched as a result of style sheets or the browser executing script code e.g. JavaScript.
		request204.addSubRequest(protocol1, southcentralus_prod_2, "/users/8:orgid:f0e49353-388f-4d23-bd1f-89310437c943/endpoints/9ad71737-cf1a-4635-a487-921eda1c9767/events/poll"); //  Request: 206, 0 Unknown
	}

	private void request282_ProcessSubRequests(Request request282) throws Exception
	{
		// Ignore these URL's when making subrequests. Either they do not appear in the recording, or they are fetched in a later request.
		request282.ignoreSubRequest(protocol1, assets, "/74d543d8cdec230b2fe1d6692856ab154ccfdfba/satelliteLib-a53bebc2074176d87b972409923c7bb1d4d9b1f0.js");
		request282.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/gnav-support.svg");
		request282.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-linkedin.svg");
		request282.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-twitter.svg");
		request282.ignoreSubRequest(protocol1, keysight, "/content/dam/keysight/en/img/gnav/icon-youtube.svg");
		request282.ignoreSubRequest(protocol1, keysight, "/etc/designs/keysight/img/content/favicon.png");
		request282.ignoreSubRequest(protocol1, keysight, "/favicon.ico");
		request282.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/logintimeout-aem.js");
		request282.ignoreSubRequest(protocol1, keysight, "/main/assets/scripts/sso-auth.js");
		// References to the following page resources could not be found within the contents of the received web page.
		// This can occur because resources are fetched as a result of style sheets or the browser executing script code e.g. JavaScript.
		request282.addSubRequest(protocol1, cdn, "/my/loop11.js"); //  Request: 343, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/648bd4af-3501-4cec-b42b-965433fc3beb.woff"); //  Request: 344, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/fb4e8319-465f-463f-96ee-1ecd750c91c6.woff"); //  Request: 345, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/a4b7aeb9-bdc9-4d27-8f9a-6b7384e92533.woff"); //  Request: 346, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/5e4b1a7c-1a9e-49d9-ae18-1a732f7a2c18.woff"); //  Request: 347, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/0d9d1013-2259-4a34-908a-9dd717cfe203.woff"); //  Request: 348, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/3bae17e1-9437-4f28-9c07-cb474607e608.woff"); //  Request: 349, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/d9c842f8-b37a-414f-be86-97ea9c61d3d7.woff"); //  Request: 350, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/adc6aa68-bc12-4c1f-932f-2b6fb09f15aa.woff"); //  Request: 351, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/f7681494-f333-459d-9621-b892d3142607.woff"); //  Request: 352, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/cee82a04-b81c-42aa-82e0-b507f7a3e048.woff"); //  Request: 353, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/015aaf06-e7a3-434e-9c0d-041f2f706b17.woff"); //  Request: 354, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/1fae1263-7236-47a3-8614-2b38feeaad62.woff"); //  Request: 355, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/47b9f157-32a5-4905-a5a0-7b9f99614f03.woff"); //  Request: 356, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/fonts/Fonts/19610f9a-f118-4a96-a156-cd28dcc5c03c.woff"); //  Request: 359, 304 Not Modified
		request282.addSubRequest(protocol1, static_, "/uwt.js"); //  Request: 360, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-share.svg"); //  Request: 361, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-facebook-white.svg"); //  Request: 362, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-linkedin-white.svg"); //  Request: 363, 304 Not Modified
		request282.addSubRequest(protocol1, keysight, "/etc/designs/keysight/clienlibs/head/img/eclipse/icon-twitter-white.svg"); //  Request: 364, 304 Not Modified
		request282.addSubRequest(protocol1, px, "/collect?v=2"
			 + "&fmt=js"
			 + "&pid=1728329"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&time=" + getMillisecondsSinceEpoch(1454) /* Replaced timestamp 1598596377404 (2020-08-28T12:02:57.404000+05:30) */ + ""); //  Request: 365, 302 Found
		request282.addSubRequest(protocol1, google_analytics, "/collect?v=1"
			 + "&_v=j83"
			 + "&a=298318469"
			 + "&t=pageview"
			 + "&_s=1"
			 + "&dl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&ul=en-us"
			 + "&de=utf-8"
			 + "&dt=Contact%20Us%20%7C%20Keysight"
			 + "&sd=24-bit"
			 + "&sr=1821x1024"
			 + "&vp=811x356"
			 + "&je=1"
			 + "&fl=32.0%20r0"
			 + "&_u=AACAAAQ~"
			 + "&jid="
			 + "&gjid="
			 + "&cid=1689172026.1598596353"
			 + "&tid=UA-48088400-1"
			 + "&_gid=416552926.1598596353"
			 + "&z=1050515445"); //  Request: 366, 200 OK
		request282.addSubRequest(protocol1, googleads, "/pagead/viewthroughconversion/1067248536/?random=" + getMillisecondsSinceEpoch(1682) /* Replaced timestamp 1598596377632 (2020-08-28T12:02:57.632000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(1682) /* Replaced timestamp 1598596377632 (2020-08-28T12:02:57.632000+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&resp=GooglemKTybQhCsO"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=3"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&ig=1"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&tiba=Contact%20Us%20%7C%20Keysight"
			 + "&hn=www.googleadservices.com"
			 + "&async=1"
			 + "&rfmt=3"
			 + "&fmt=4"); //  Request: 367, 200 OK
		request282.addSubRequest(protocol1, facebook, "/tr/?id=399413163752712"
			 + "&ev=PageView"
			 + "&dl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&rl=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&if=false"
			 + "&ts=" + getMillisecondsSinceEpoch(1663) /* Replaced timestamp 1598596377613 (2020-08-28T12:02:57.613000+05:30) */ + ""
			 + "&sw=1821"
			 + "&sh=1024"
			 + "&v=2.9.23"
			 + "&r=stable"
			 + "&ec=0"
			 + "&o=13"
			 + "&fbp=" + getWebBrowser().getCookieValue(smetrics.host(), "/", "_fbp") + ""
			 + "&it=" + getMillisecondsSinceEpoch(1483) /* Replaced timestamp 1598596377433 (2020-08-28T12:02:57.433000+05:30) */ + ""
			 + "&coo=false"
			 + "&rqm=GET"); //  Request: 368, 200 OK
		request282.addSubRequest(protocol1, keysight_h, "/is/image/content/dam/keysight/en/img/other/contact/contactus_herobanner_ss541275424_v2.jpg?wid=811"); //  Request: 369, 200 OK
		request282.addSubRequest(protocol1, youtube, "/iframe_api"); //  Request: 370, 200 OK
		request282.addSubRequest(protocol1, smetrics, "/b/ss/agilentcom/1/JS-2.17.0-D7QN/s87897177586751?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A57%205%20-330"
			 + "&sdid=58A8DC75FD215901-40D1A4DBD5372ECA"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=Contact%20Us"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&r=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&server=AEM"
			 + "&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y"
			 + "&c1=Contact%20Us%20%7C%20Keysight"
			 + "&h1=Worldwide%20Home%2F%2F%2F"
			 + "&c2=contact"
			 + "&c10=Contact%20Us%20%7C%20Keysight"
			 + "&c13=Not%20Logged%20In"
			 + "&c15=IN"
			 + "&c16=eng"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&v73=D%3Dmid"
			 + "&c."
			 + "&a."
			 + "&activitymap."
			 + "&page=%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&link=Contact%20Us"
			 + "&region=util-contacts"
			 + "&pageIDType=1"
			 + "&.activitymap"
			 + "&.a"
			 + "&.c"
			 + "&pid=%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&pidt=1"
			 + "&oid=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&ot=A"
			 + "&oi=150"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&AQE=1"); //  Request: 371, 200 OK
		request282.addSubRequest(protocol1, smetrics, "/b/ss/ktkeysitecomprod/1/JS-2.17.0-D7QN/s88578647519628?AQB=1"
			 + "&ndh=1"
			 + "&pf=1"
			 + "&t=28%2F7%2F2020%2012%3A2%3A57%205%20-330"
			 + "&sdid=58A8DC75FD215901-40D1A4DBD5372ECA"
			 + "&D=D%3D"
			 + "&mid=10179588773231593744477580279709953543"
			 + "&aamlh=12"
			 + "&ce=UTF-8"
			 + "&pageName=%2Fcontact.html"
			 + "&g=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&r=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&server=AEM"
			 + "&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y"
			 + "&c1=Contact%20Us%20%7C%20Keysight"
			 + "&h1=Worldwide%20Home%2F%2F%2F"
			 + "&c3=contact"
			 + "&c4=None"
			 + "&c5=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&c7=10179588773231593744477580279709953543"
			 + "&c8=None"
			 + "&c10=Contact%20Us%20%7C%20Keysight"
			 + "&c13=Not%20Logged%20In"
			 + "&c15=IN"
			 + "&c16=eng"
			 + "&c21=No%20Product%20Line%20Number%20Set"
			 + "&c24=Contact%20Us"
			 + "&v43=No%20Business%20Unit%20Set"
			 + "&v44=No%20Campaign%20Set"
			 + "&v46=No%20Product%20Category%20Set"
			 + "&v47=No%20Product%20Form%20Factor%20Set"
			 + "&s=1821x1024"
			 + "&c=24"
			 + "&j=1.6"
			 + "&v=Y"
			 + "&k=Y"
			 + "&bw=835"
			 + "&bh=356"
			 + "&mcorgid=6BA0655351E5642F0A490D44%40AdobeOrg"
			 + "&AQE=1"); //  Request: 372, 200 OK
		request282.addSubRequest(protocol1, google_com, "/pagead/1p-user-list/1067248536/?random=" + getMillisecondsSinceEpoch(1682) /* Replaced timestamp 1598596377632 (2020-08-28T12:02:57.632000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(-1975950) /* Replaced timestamp 1598594400000 (2020-08-28T11:30:00+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=3"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&tiba=Contact%20Us%20%7C%20Keysight"
			 + "&async=1"
			 + "&fmt=3"
			 + "&is_vtc=1"
			 + "&random=2563770060"
			 + "&resp=GooglemKTybQhCsO"
			 + "&rmt_tld=0"
			 + "&ipr=y"); //  Request: 373, 200 OK
		request282.addSubRequest(protocol1, google, "/pagead/1p-user-list/1067248536/?random=" + getMillisecondsSinceEpoch(1682) /* Replaced timestamp 1598596377632 (2020-08-28T12:02:57.632000+05:30) */ + ""
			 + "&cv=9"
			 + "&fst=" + getMillisecondsSinceEpoch(-1975950) /* Replaced timestamp 1598594400000 (2020-08-28T11:30:00+05:30) */ + ""
			 + "&num=1"
			 + "&bg=ffffff"
			 + "&guid=ON"
			 + "&u_h=1024"
			 + "&u_w=1821"
			 + "&u_ah=967"
			 + "&u_aw=1821"
			 + "&u_cd=24"
			 + "&u_his=3"
			 + "&u_tz=330"
			 + "&u_java=true"
			 + "&u_nplug=2"
			 + "&u_nmime=4"
			 + "&gtm=2oa8j2"
			 + "&data=event%3Dgtag.config"
			 + "&frm=0"
			 + "&url=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fcontact.html"
			 + "&ref=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&tiba=Contact%20Us%20%7C%20Keysight"
			 + "&async=1"
			 + "&fmt=3"
			 + "&is_vtc=1"
			 + "&random=2563770060"
			 + "&resp=GooglemKTybQhCsO"
			 + "&rmt_tld=1"
			 + "&ipr=y"); //  Request: 374, 200 OK
		request282.addSubRequest(protocol1, img, "/i/elqCfg.min.js"); //  Request: 375, 200 OK
		request282.addSubRequest(protocol1, s609785623, "/visitor/v200/svrGP?pps=3"
			 + "&siteid=609785623"
			 + "&ref2=https%3A%2F%2Fwww.keysight.com%2Fin%2Fen%2Fproducts%2Fwaveform-and-function-generators.html"
			 + "&tzo=-330"
			 + "&ms=321"
			 + "&optin=disabled"); //  Request: 380, 200 OK
		request282.addSubRequest(protocol1, consent, "/notice?domain=keysight.com"
			 + "&c=teconsent"
			 + "&country=IN"); //  Request: 381, 200 OK
		request282.addSubRequest(protocol1, bam, "/1/e2d441516f?a=58430063"
			 + "&sa=1"
			 + "&v=1026.7a27a3e"
			 + "&t=Unnamed%20Transaction"
			 + "&rst=3576"
			 + "&ref=https://www.keysight.com/in/en/contact.html"
			 + "&be=1391"
			 + "&fe=3451"
			 + "&dc=2299"
			 + "&af=err,xhr,stn,ins"
			 + "&perf=%7B%22timing%22:%7B%22of%22:" + getMillisecondsSinceEpoch(-200) /* Replaced timestamp 1598596375750 (2020-08-28T12:02:55.750000+05:30) */ + ",%22n%22:0,%22u%22:814,%22ue%22:814,%22f%22:1,%22dn%22:1,%22dne%22:1,%22c%22:1,%22ce%22:1,%22rq%22:198,%22rp%22:755,%22rpe%22:778,%22dl%22:755,%22di%22:2266,%22ds%22:2266,%22de%22:2373,%22dc%22:3425,%22l%22:3432"
			 + ",%22le%22:3558%7D,%22navigation%22:%7B%7D%7D"
			 + "&jsonp=NREUM.setToken"); //  Request: 382, 200 OK
	}

}

