package fr.istic.m2.taa.classcounter_maven_plugin;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
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

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.clapper.classutil.ClassFinder;
import org.clapper.classutil.ClassInfo;
import org.jfrog.maven.annomojo.annotations.MojoGoal;
import org.jfrog.maven.annomojo.annotations.MojoParameter;
import org.jfrog.maven.annomojo.annotations.MojoPhase;

@MojoGoal("count")
@MojoPhase("compile")
public class ClassCounterMojo extends AbstractMojo {
	
	@MojoParameter(alias="out", expression="${project.build.directory}", required=true)
	private File out;
	
	@MojoParameter(alias="lang", defaultValue="french", required=true)
	private String lang;
	
    public void execute() throws MojoExecutionException {
    	File f = out;
    	File f1 = new File(out.getAbsolutePath() + File.separator + "classes");
    	List<File> files = new ArrayList<File>();
    	files.add(f1);
    	ClassFinder finder = new ClassFinder(scala.collection.JavaConversions.asScalaBuffer(files));
    	
    	if ("french".equals(lang)) {
    		getLog().info("Nombre de classes : " + finder.getClasses().size());
    	} else {
    		getLog().info("Number of classes : " + finder.getClasses().size());
    	}
    	
    	scala.collection.Iterator<ClassInfo> it = finder.getClasses();
    	while (it.hasNext()) {
    		ClassInfo c = it.next();
    		if ("french".equals(lang)) {
    			getLog().info("\t Pour la classe " + c.name());
    			getLog().info("\t \t Nombre d'attributs " + c.fields().size());
    			getLog().info("\t \t Nombre de méthodes" + c.methods().size());
    		} else {
    			getLog().info("\t For the class names " + c.name());
    			getLog().info("\t \t Number of field " + c.fields().size());
    			getLog().info("\t \t Number of methods" + c.methods().size());
    		}
    	}
    }
}
