/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webtest.platform;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author suren
 * @date 2017年1月24日 下午2:03:57
 */
public class AutoTestURLClassloader extends URLClassLoader
{
	private String root;

	/**
	 * @param urls
	 * @param parent
	 */
	public AutoTestURLClassloader(URL[] urls, ClassLoader parent)
	{
		super(urls, parent);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException
	{
		return super.findClass(name);
	}

	public String getRoot()
	{
		return root;
	}

	public void setRoot(String root)
	{
		this.root = root;
	}

}
