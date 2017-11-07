package edu.jhu.cvrg.sapphire.data.request;

/*
Copyright 2017 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/**
 * @author Stephen Granite
 * 
 */

import edu.jhu.cvrg.sapphire.data.common.Header;

public class GenericResponse {

	private String xmlNameSpace = "urn:ge:sapphire:genericMsg_1";
	private String status, errorString;
	private Header header;

	public String getXmlNameSpace() {
		return xmlNameSpace;
	}
	
	public void setXmlNameSpace(String xmlNameSpace) {
		this.xmlNameSpace = xmlNameSpace;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorString() {
		return errorString;
	}

	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}

	public Header getHeader() {
		return header;
	}
	
	public void setHeader(Header header) {
		this.header = header;
	}
}
