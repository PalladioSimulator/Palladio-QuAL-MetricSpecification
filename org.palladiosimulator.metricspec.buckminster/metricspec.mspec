<?xml version="1.0" encoding="UTF-8"?>
<mspec:mspec xmlns:bc="http://www.eclipse.org/buckminster/Common-1.0" 
             xmlns:mspec="http://www.eclipse.org/buckminster/MetaData-1.0"
             materializer="p2" name="metricspec.mspec" url="metricspec.cquery" 
             conflictResolution="UPDATE">

	<mspec:property key="target.os" value="*" />
	<mspec:property key="target.ws" value="*" />
	<mspec:property key="target.arch" value="*" />
	
	<mspec:mspecNode filter="(buckminster.source=true)"
				     materializer="workspace" conflictResolution="UPDATE"/>
</mspec:mspec>