package com.playground.daggerplayground.injection.module;

import android.content.Context;

import com.playground.daggerplayground.DaggerPlayGroundApplication;
import com.playground.daggerplayground.injection.ApplicationContext;
import com.playground.daggerplayground.services.preference.PreferenceService;
import com.playground.daggerplayground.services.preference.SharedPreferenceService;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Application level component.
 * Created by petnagy on 2017. 04. 30..
 */
@Module
public abstract class ApplicationModule {

    @Binds
    @ApplicationContext
    abstract Context provideContext(DaggerPlayGroundApplication application);

    @Singleton
    @Provides
    static PreferenceService provideSharedPreference(@ApplicationContext Context context) {
        return new SharedPreferenceService(context);
    }
}
