package com.mytaxi.apis.phraseapi.client

import com.mytaxi.apis.phraseapi.client.model.*

@Suppress("TooManyFunctions")
interface PhraseApiClient {

    fun projects(): PhraseProjects?

    fun project(projectId: String): PhraseProject?

    fun deleteProject(projectId: String): Boolean

    fun createProject(phraseProject: CreatePhraseProject): PhraseProject?

    fun updateProject(projectId: String, phraseProject: UpdatePhraseProject): PhraseProject?

    fun locale(projectId: String, localeId: String, branch: String? = null): PhraseLocale?

    fun locales(projectId: String, branch: String? = null): PhraseLocales?

    fun createLocale(projectId: String, locale: CreatePhraseLocale): PhraseLocale?

    fun downloadLocale(projectId: String, localeId: String, downloadLocale: DownloadPhraseLocale? = null): PhraseLocaleMessages?

    fun downloadLocaleAsProperties(projectId: String, localeId: String,
                                   escapeSingleQuotes: Boolean, branch: String? = null): ByteArray?

    fun deleteLocale(projectId: String, localeId: String, branch: String? = null)

    fun translations(project: PhraseProject, locale: PhraseLocale, branch: String? = null): Translations?

    fun createTranslation(projectId: String, createTranslation: CreateTranslation): Translation?

    fun createTranslation(projectId: String, localeId: String,
                          keyId: String, content: String,
                          branch: String? = null): Translation?

    fun createKey(project: String, createKey: CreateKey): Key?

    fun createKey(project: String, name: String, tags: ArrayList<String>?, branch: String? = null): Key?

    fun searchKey(projectId: String, localeId: String?, q: String?, branch: String? = null): Keys?

    fun deleteKey(projectId: String, keyId: String, branch: String? = null): Boolean

}
