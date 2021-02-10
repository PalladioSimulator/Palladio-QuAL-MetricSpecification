/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EDataType;
import org.palladiosimulator.metricspec.util.DeserializationUtil;


public class MetricSpecFactoryImpl extends MetricSpecFactoryImplGen {

    
    public Unit<?> createEJSUnitFromString(final EDataType eDataType, final String initialValue) {
        return (Unit<?>) DeserializationUtil.createFromString(initialValue, Unit.class.getClassLoader());
    }


} // MetricSpecFactoryImpl
