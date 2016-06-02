/**
 */
package org.palladiosimulator.metricspec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Scope Of Validity</b></em>', and utility methods for working with them. <!-- end-user-doc
 * --> <!-- begin-model-doc --> We distinguish the scope of validity for a metric: a metric can
 * either be discrete (only valid for the event the metric was measured) or continuous (for every
 * point in time, the a valid measurement exists).
 *
 * Note for continuous option: we currently define that measurements are valid staring from the
 * point they where taken until the next measurement is taken. This is, e.g., important for
 * measurements that need to be aggregated over intervals. If this definition does not fit a
 * use-case, discuss about redefining this definition. <!-- end-model-doc -->
 *
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getScopeOfValidity()
 * @model
 * @generated
 */
public enum ScopeOfValidity implements Enumerator {
    /**
     * The '<em><b>Discrete</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #DISCRETE_VALUE
     * @generated
     * @ordered
     */
    DISCRETE(0, "Discrete", "Discrete"),

    /**
     * The '<em><b>Continuous</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #CONTINUOUS_VALUE
     * @generated
     * @ordered
     */
    CONTINUOUS(1, "Continuous", "Continuous");

    /**
     * The '<em><b>Discrete</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Discrete</b></em>' literal object isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #DISCRETE
     * @model name="Discrete"
     * @generated
     * @ordered
     */
    public static final int DISCRETE_VALUE = 0;

    /**
     * The '<em><b>Continuous</b></em>' literal value. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Continuous</b></em>' literal object isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @see #CONTINUOUS
     * @model name="Continuous"
     * @generated
     * @ordered
     */
    public static final int CONTINUOUS_VALUE = 1;

    /**
     * An array of all the '<em><b>Scope Of Validity</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final ScopeOfValidity[] VALUES_ARRAY = new ScopeOfValidity[] { DISCRETE, CONTINUOUS, };

    /**
     * A public read-only list of all the '<em><b>Scope Of Validity</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<ScopeOfValidity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Scope Of Validity</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ScopeOfValidity get(final String literal) {
        for (final ScopeOfValidity result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Scope Of Validity</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ScopeOfValidity getByName(final String name) {
        for (final ScopeOfValidity result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Scope Of Validity</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ScopeOfValidity get(final int value) {
        switch (value) {
        case DISCRETE_VALUE:
            return DISCRETE;
        case CONTINUOUS_VALUE:
            return CONTINUOUS;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private ScopeOfValidity(final int value, final String name, final String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLiteral() {
        return this.literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        return this.literal;
    }

} // ScopeOfValidity
