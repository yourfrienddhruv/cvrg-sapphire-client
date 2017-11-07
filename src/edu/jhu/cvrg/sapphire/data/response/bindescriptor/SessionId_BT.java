package edu.jhu.cvrg.sapphire.data.response.bindescriptor;

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

public class SessionId_BT {

	String binaryType, arraySizeBinaryType, sessionType;

	public SessionId_BT() {
		
		this("unknown","1","unknown");
		
	}
	
	public SessionId_BT(String binaryType, String arraySizeBinaryType, String sessionType) {

		setBinaryType(binaryType);
		setArraySizeBinaryType(arraySizeBinaryType);
		setSessionType(sessionType);

	}

	public String getBinaryType() {
		return binaryType;
	}

	public void setBinaryType(String binaryType) {
		this.binaryType = binaryType;
	}

	public String getArraySizeBinaryType() {
		return arraySizeBinaryType;
	}

	public void setArraySizeBinaryType(String arraySizeBinaryType) {
		this.arraySizeBinaryType = arraySizeBinaryType;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

}
