package com.example.demo

import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition
import org.springframework.stereotype.Repository


@AnalyzeClasses(
    packages = ["com.example.demo"],
    importOptions = [ImportOption.DoNotIncludeTests::class]
)

class ArchUnitTest {
    @ArchTest
    val `repositories are in right package` = ArchRuleDefinition.classes()
        .that().areAnnotatedWith(Repository::class.java)
        .should().resideInAPackage("..persistence.repository..")
}
