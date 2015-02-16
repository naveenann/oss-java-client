/**
 * Copyright 2014-2015 OpenSearchServer Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.opensearchserver.client.api.search.query.filter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeName;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_EMPTY)
@XmlType(name = "TermFilter")
@XmlRootElement(name = "TermFilter")
@JsonTypeName("TermFilter")
public class TermFilter extends AbstractFilter {

	public String field;
	public String term;

	public TermFilter() {
		field = null;
		term = null;
	}

	public TermFilter(String field, String term) {
		this.field = field;
		this.term = term;
	}

	public TermFilter setField(String field) {
		this.field = field;
		return this;
	}

	public TermFilter setTerm(String term) {
		this.term = term;
		return this;
	}
}