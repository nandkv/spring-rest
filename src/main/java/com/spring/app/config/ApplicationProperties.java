package com.spring.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
	
	private final Datasource datasource = new Datasource();

    private final Mail mail = new Mail();
    
    private final Hibernate hibernate = new Hibernate();
    
    private final Jpa jpa = new Jpa();
    

	public Datasource getDatasource() {
		return datasource;
	}

	public Mail getMail() {
		return mail;
	}

	public Hibernate getHibernate() {
		return hibernate;
	}

	public Jpa getJpa() {
		return jpa;
	}

	public static class Datasource {

	    private String driver;
		private String url;
		private String name;
		private String username;
		private String password;
		
		private boolean cachePrepStmts = true;

		private int prepStmtCacheSize = 250;

		private int prepStmtCacheSqlLimit = 2048;

		private boolean useServerPrepStmts = true;

		public String getDriver() {
			return driver;
		}

		public void setDriver(String driver) {
			this.driver = driver;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isCachePrepStmts() {
			return cachePrepStmts;
		}

		public void setCachePrepStmts(boolean cachePrepStmts) {
			this.cachePrepStmts = cachePrepStmts;
		}

		public int getPrepStmtCacheSize() {
			return prepStmtCacheSize;
		}

		public void setPrepStmtCacheSize(int prepStmtCacheSize) {
			this.prepStmtCacheSize = prepStmtCacheSize;
		}

		public int getPrepStmtCacheSqlLimit() {
			return prepStmtCacheSqlLimit;
		}

		public void setPrepStmtCacheSqlLimit(int prepStmtCacheSqlLimit) {
			this.prepStmtCacheSqlLimit = prepStmtCacheSqlLimit;
		}

		public boolean isUseServerPrepStmts() {
			return useServerPrepStmts;
		}

		public void setUseServerPrepStmts(boolean useServerPrepStmts) {
			this.useServerPrepStmts = useServerPrepStmts;
		}


	}
	
    public static class Mail {

        private String from;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }
    }
    
    public static class Hibernate{
    	private boolean useSecondLevelCache;
    	
    	private boolean useQueryCache;
    	
    	private boolean generateStatistics;
    	
    	private String  cacheRegionFactory;
    	
    	private boolean useMinimalPuts;
    	
    	private boolean useLiteMember;

		/**
		 * @return the useSecondLevelCache
		 */
		public boolean isUseSecondLevelCache() {
			return useSecondLevelCache;
		}

		/**
		 * @param useSecondLevelCache the useSecondLevelCache to set
		 */
		public void setUseSecondLevelCache(boolean useSecondLevelCache) {
			this.useSecondLevelCache = useSecondLevelCache;
		}

		/**
		 * @return the useQueryCache
		 */
		public boolean isUseQueryCache() {
			return useQueryCache;
		}

		/**
		 * @param useQueryCache the useQueryCache to set
		 */
		public void setUseQueryCache(boolean useQueryCache) {
			this.useQueryCache = useQueryCache;
		}

		/**
		 * @return the generateStatistics
		 */
		public boolean isGenerateStatistics() {
			return generateStatistics;
		}

		/**
		 * @param generateStatistics the generateStatistics to set
		 */
		public void setGenerateStatistics(boolean generateStatistics) {
			this.generateStatistics = generateStatistics;
		}

		/**
		 * @return the cacheRegionFactory
		 */
		public String getCacheRegionFactory() {
			return cacheRegionFactory;
		}

		/**
		 * @param cacheRegionFactory the cacheRegionFactory to set
		 */
		public void setCacheRegionFactory(String cacheRegionFactory) {
			this.cacheRegionFactory = cacheRegionFactory;
		}

		/**
		 * @return the useMinimalPuts
		 */
		public boolean isUseMinimalPuts() {
			return useMinimalPuts;
		}

		/**
		 * @param useMinimalPuts the useMinimalPuts to set
		 */
		public void setUseMinimalPuts(boolean useMinimalPuts) {
			this.useMinimalPuts = useMinimalPuts;
		}

		/**
		 * @return the useLiteMember
		 */
		public boolean isUseLiteMember() {
			return useLiteMember;
		}

		/**
		 * @param useLiteMember the useLiteMember to set
		 */
		public void setUseLiteMember(boolean useLiteMember) {
			this.useLiteMember = useLiteMember;
		}
    	

    }
    
    public static class Jpa {
    	private String persistenceUnitName;
    	private String databasePlatform;
    	private String database;
    	private boolean hibernateShowSql;
    	private boolean hibernateGeneratedDdl;
    	private boolean hibernateHbm2ddlAuto;
    	private String hibernateDialect;
		/**
		 * @return the persistenceUnitName
		 */
		public String getPersistenceUnitName() {
			return persistenceUnitName;
		}
		/**
		 * @param persistenceUnitName the persistenceUnitName to set
		 */
		public void setPersistenceUnitName(String persistenceUnitName) {
			this.persistenceUnitName = persistenceUnitName;
		}
		/**
		 * @return the databasePlatform
		 */
		public String getDatabasePlatform() {
			return databasePlatform;
		}
		/**
		 * @param databasePlatform the databasePlatform to set
		 */
		public void setDatabasePlatform(String databasePlatform) {
			this.databasePlatform = databasePlatform;
		}
		/**
		 * @return the database
		 */
		public String getDatabase() {
			return database;
		}
		/**
		 * @param database the database to set
		 */
		public void setDatabase(String database) {
			this.database = database;
		}
		/**
		 * @return the hibernateShowSql
		 */
		public boolean isHibernateShowSql() {
			return hibernateShowSql;
		}
		/**
		 * @param hibernateShowSql the hibernateShowSql to set
		 */
		public void setHibernateShowSql(boolean hibernateShowSql) {
			this.hibernateShowSql = hibernateShowSql;
		}
		/**
		 * @return the hibernateGeneratedDdl
		 */
		public boolean isHibernateGeneratedDdl() {
			return hibernateGeneratedDdl;
		}
		/**
		 * @param hibernateGeneratedDdl the hibernateGeneratedDdl to set
		 */
		public void setHibernateGeneratedDdl(boolean hibernateGeneratedDdl) {
			this.hibernateGeneratedDdl = hibernateGeneratedDdl;
		}
		/**
		 * @return the hibernateHbm2ddlAuto
		 */
		public boolean isHibernateHbm2ddlAuto() {
			return hibernateHbm2ddlAuto;
		}
		/**
		 * @param hibernateHbm2ddlAuto the hibernateHbm2ddlAuto to set
		 */
		public void setHibernateHbm2ddlAuto(boolean hibernateHbm2ddlAuto) {
			this.hibernateHbm2ddlAuto = hibernateHbm2ddlAuto;
		}
		/**
		 * @return the hibernateDialect
		 */
		public String getHibernateDialect() {
			return hibernateDialect;
		}
		/**
		 * @param hibernateDialect the hibernateDialect to set
		 */
		public void setHibernateDialect(String hibernateDialect) {
			this.hibernateDialect = hibernateDialect;
		}

    			 
    }
}
