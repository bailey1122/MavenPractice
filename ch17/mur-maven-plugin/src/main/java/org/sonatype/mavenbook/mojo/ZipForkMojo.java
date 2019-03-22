package org.sonatype.mavenbook.plugins;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;


import org.apache.maven.plugins.annotations.Mojo;
/**
 * Forks a zip lifecycle.
 * @goal zip-fork
 * @execute lifecycle="zipcycle" phase="package"
 */
public class ZipForkMojo extends AbstractMojo
{
 public void execute()
 throws MojoExecutionException
 {
 getLog().info( "doing nothing here" );
 }
}