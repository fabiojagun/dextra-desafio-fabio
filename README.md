Fábio Junco Amaral

April 5, 2019

Dextra Challenge

This README will explain some choices made for this challenge architecture.

First, to set up the Espresso Android, we need to add theselines into the project gradle:

	androidTestImplementation 'com.android.support.test:runner:1.0.2'
	androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
	androidTestImplementation 'com.android.support.test:rules:1.0.2'

And then add these lines to set up Cucumber, first add:

	buildscript {
	    repositories {
		mavenCentral()
	    }

	dependencies {
		classpath 'org.jacoco:org.jacoco.core:0.7.9'
		}
	}

	apply plugin: 'com.android.application'
	apply plugin: 'jacoco'

Into dependencies{} add:

	androidTestImplementation 'info.cukes:cucumber-android:1.2.5@jar'
	androidTestImplementation 'info.cukes:cucumber-picocontainer:1.2.4'

Then add:

	def getTestTags() {
	    return project.hasProperty("tags") ? project.getProperties().get("tags") : ""
	}

Now, the structure to run BDD with Cucumber is pretty default and common knowledge, as we try to follow good practices.
Under androidTests, we create packages (or directories/folders) such as:
- pages
	- constants (used for writing constants and other variables)
		- java class: 
	- robot (where most of our logic is written)
		- java class: 
- runner
	- actions (almost never changes, it is basically good practices and performance)
		- java class: 
		- java class: 
- steps (another place to write our logic, this will talk directly with our test cases)
	- java class: 

Now we will create our cucumber file as .feature, under Project>project-name>app>src>androidTest>assets>features>name.feature
This is where our test cases will be written.



First clone the git from https://github.com/fabiojagun/dextra-desafio-fabio and open Android Studio.
To run all tests, go to the Java class called Instrumentation and under @Test, then click the Green Arrow.
