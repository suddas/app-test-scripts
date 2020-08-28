Action()
{


	
	web_reg_find("Text=bing","SaveCount=bing",LAST);
	
	lr_start_transaction("Bing_com");
	 
	
	web_url("bing.com", 
		"URL=http://www.bing.com", 
		"TargetFrame=", 
		"Resource=0", 
		"Referer=", 
		"RecContentType=text/html", 
		"Snapshot=t1.inf", 
		"Mode=HTML",
	LAST);
	
	HttpRetCode = web_get_int_property(HTTP_INFO_RETURN_CODE);
	
	if((atoi(lr_eval_string("{bing}"))>0)&&(HttpRetCode==200))
	{
		
		lr_end_transaction("Bing_com", LR_PASS);
		
		
	}
	else
	{
		lr_error_message ("Bing_com failed with status code,%d", HttpRetCode);
		lr_end_transaction("Bing_com", LR_FAIL);
	}


	return 0;
}