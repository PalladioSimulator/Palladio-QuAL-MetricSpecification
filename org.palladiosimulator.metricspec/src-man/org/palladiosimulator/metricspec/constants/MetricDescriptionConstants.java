package org.palladiosimulator.metricspec.constants;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;

/**
 * Constant metric descriptions, commonly used by ProbeFramework.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public final class MetricDescriptionConstants {
    private static final String PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC = "pathmap://METRIC_SPEC_MODELS/commonMetrics.metricspec";

	static {
    	final ResourceSet resourceSet = new ResourceSetImpl();
    	final Resource resource = resourceSet.createResource(URI.createURI(PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC, true));
    	try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block. Use eclipse error log instead?
			e.printStackTrace();
		}
    	
    	RESPONSE_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_6rYmYs7nEeOX_4BzImuHbA");
    	POINT_IN_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_NCRBos7pEeOX_4BzImuHbA");
    	HOLD_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_zETOUs7pEeOX_4BzImuHbA");
    	WAITING_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_QWjAYs7qEeOX_4BzImuHbA");
    	RESOURCE_DEMAND_METRIC = (BaseMetricDescription) resource.getEObject("_eg_F0s7qEeOX_4BzImuHbA");
    	CPU_STATE_METRIC = (BaseMetricDescription) resource.getEObject("_paDhIs7qEeOX_4BzImuHbA");
    	PASSIVE_RESOURCE_STATE_METRIC = (BaseMetricDescription) resource.getEObject("_x0-pks7rEeOX_4BzImuHbA");
    	EXECUTION_RESULT_METRIC = (BaseMetricDescription) resource.getEObject("_7Is3ss7rEeOX_4BzImuHbA");
    	CPU_STATE_OVER_TIME_METRIC = (MetricSetDescription) resource.getEObject("_MSlw0c7sEeOX_4BzImuHbA");
    }
	
    /** Specifies a response time metric, e.g., to store the response time of operation calls. */
    public final static BaseMetricDescription RESPONSE_TIME_METRIC;
    
    /** Specifies a point in time metric, e.g., to store an event time stamp. */
    public final static BaseMetricDescription POINT_IN_TIME_METRIC;
    
    /** Specifies a hold time metric, e.g., to store the time spend in a passive resource. */
    public final static BaseMetricDescription HOLD_TIME_METRIC;
    
    /** Specifies a waiting time metric, e.g., to store the waiting time at passive resource pools. */
    public final static BaseMetricDescription WAITING_TIME_METRIC;
    
    /** Specifies a resource demand metric, e.g., to store CPU demand measurements. */
    public final static BaseMetricDescription RESOURCE_DEMAND_METRIC;
    
    /** Specifies a CPU metric, e.g., to store CPU utilization at a certain time/state. */
    public final static BaseMetricDescription CPU_STATE_METRIC;

    /** Specifies a passive resource state metric. */
    public final static BaseMetricDescription PASSIVE_RESOURCE_STATE_METRIC;

    /** Specifies an execution results metric, e.g., to store simulated failure occurances. */
    public final static BaseMetricDescription EXECUTION_RESULT_METRIC;

    public final static MetricSetDescription CPU_STATE_OVER_TIME_METRIC;

    private MetricDescriptionConstants() {
    }
}
