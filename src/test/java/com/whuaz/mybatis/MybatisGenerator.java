package com.whuaz.mybatis;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 自动生成实体类和增删改查
 * @author grez
 * @since 18-12-3
 **/
public class MybatisGenerator {


    public static void main(String[] args) {
        tableList();
    }

    private static void tableList() {
        String packageName = "com.whuaz.mybatis.entity";
        String moduleName = "base";
        String[] tables = new String[] {"t_user"};
        autoGenerateCode(tables, packageName, moduleName);
    }

    private static void autoGenerateCode(String[] tables, String packageName, String moduleName) {

        AutoGenerator mpg = new AutoGenerator();
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("/home/grez/MybatisGenerator");// 自定义
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("grez");
        mpg.setGlobalConfig(gc);
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.POSTGRE_SQL);
        dsc.setDriverName("org.postgresql.Driver");
        dsc.setUsername("postgres");
        dsc.setPassword("postgres");
//        dsc.setUrl("jdbc:postgresql://localhost:5432/app");
        dsc.setUrl("jdbc:postgresql://localhost:5432/app");
        mpg.setDataSource(dsc);
        StrategyConfig strategy = new StrategyConfig();
//        strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(tables); // 需要生成的表
        mpg.setStrategy(strategy);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(packageName);
        pc.setModuleName(moduleName);
        mpg.setPackageInfo(pc);
        mpg.execute();
    }
}
