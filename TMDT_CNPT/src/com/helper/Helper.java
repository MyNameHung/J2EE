package com.helper;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Helper {
	public SessionFactory sessionFactory;

	public Session ses;
	Transaction tran;
	public String error;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean Save(Object obj) {

		boolean check = true;
		try {
			ses = sessionFactory.openSession();
			tran = ses.beginTransaction();
			ses.saveOrUpdate(obj);
			tran.commit();
		} catch (Exception e) {
			error = e.toString();
			check = false;
		} finally {
			if (ses.isOpen())
				ses.close();
		}
		return check;

	}

	public boolean Remove(Object obj) {
		boolean check = true;
		try {
			ses = sessionFactory.openSession();
			tran = ses.beginTransaction();
			ses.delete(obj);
			tran.commit();
		} catch (Exception e) {
			error = e.toString();
			check = false;
		} finally {
			if (ses.isOpen())
				ses.close();
		}
		return check;
	}

	public List ToList(String query) {
		List lstTmp = null;
		try {
			ses = sessionFactory.openSession();
			tran = ses.beginTransaction();
			lstTmp = ses.createQuery(query).list();
			tran.commit();
		} catch (Exception e) {
			error = e.toString();
		} finally {
			if (ses.isOpen())
				ses.close();
		}

		return lstTmp;
	}

	public List CallProcedure(String query,Class entity) {
		List lstTmp = null;
		
		try {
			ses = sessionFactory.openSession();
			tran = ses.beginTransaction();
			lstTmp = ses.createSQLQuery(query).addEntity(entity).list();
			tran.commit();
		} catch (Exception e) {
			error = e.toString();
		} finally {
			if (ses.isOpen())
				ses.close();
		}

		return lstTmp;
	}

	
}
