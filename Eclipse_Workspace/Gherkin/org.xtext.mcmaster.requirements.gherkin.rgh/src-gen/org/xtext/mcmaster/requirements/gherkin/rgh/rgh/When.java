/**
 * generated by Xtext 2.32.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.rgh;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.When#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends Steps
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getWhen_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

} // When
