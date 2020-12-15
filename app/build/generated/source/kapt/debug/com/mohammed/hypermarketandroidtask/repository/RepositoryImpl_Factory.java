// Generated by Dagger (https://dagger.dev).
package com.mohammed.hypermarketandroidtask.repository;

import com.mohammed.hypermarketandroidtask.SharedPreferencesStorage;
import com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<ProviderRemoteDataSource> remoteDataSourceProvider;

  private final Provider<SharedPreferencesStorage> sharedPreferencesStorageProvider;

  public RepositoryImpl_Factory(Provider<ProviderRemoteDataSource> remoteDataSourceProvider,
      Provider<SharedPreferencesStorage> sharedPreferencesStorageProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.sharedPreferencesStorageProvider = sharedPreferencesStorageProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(remoteDataSourceProvider.get(), sharedPreferencesStorageProvider.get());
  }

  public static RepositoryImpl_Factory create(
      Provider<ProviderRemoteDataSource> remoteDataSourceProvider,
      Provider<SharedPreferencesStorage> sharedPreferencesStorageProvider) {
    return new RepositoryImpl_Factory(remoteDataSourceProvider, sharedPreferencesStorageProvider);
  }

  public static RepositoryImpl newInstance(ProviderRemoteDataSource remoteDataSource,
      SharedPreferencesStorage sharedPreferencesStorage) {
    return new RepositoryImpl(remoteDataSource, sharedPreferencesStorage);
  }
}
