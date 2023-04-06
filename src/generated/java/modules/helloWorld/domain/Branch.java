package modules.helloWorld.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.impl.domain.AbstractPersistentBean;

/**
 * Branch
 * 
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Branch extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "helloWorld";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Branch";

	/** @hidden */
	public static final String branchIdPropertyName = "branchId";

	/** @hidden */
	public static final String branchNamePropertyName = "branchName";

	/**
	 * Branch Id
	 **/
	private Integer branchId;

	/**
	 * Branch Name
	 **/
	private String branchName;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Branch.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Branch.DOCUMENT_NAME;
	}

	public static Branch newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Branch - {branchId}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Branch) && 
					this.getBizId().equals(((Branch) o).getBizId()));
	}

	/**
	 * {@link #branchId} accessor.
	 * @return	The value.
	 **/
	public Integer getBranchId() {
		return branchId;
	}

	/**
	 * {@link #branchId} mutator.
	 * @param branchId	The new value.
	 **/
	@XmlElement
	public void setBranchId(Integer branchId) {
		preset(branchIdPropertyName, branchId);
		this.branchId = branchId;
	}

	/**
	 * {@link #branchName} accessor.
	 * @return	The value.
	 **/
	public String getBranchName() {
		return branchName;
	}

	/**
	 * {@link #branchName} mutator.
	 * @param branchName	The new value.
	 **/
	@XmlElement
	public void setBranchName(String branchName) {
		preset(branchNamePropertyName, branchName);
		this.branchName = branchName;
	}
}
