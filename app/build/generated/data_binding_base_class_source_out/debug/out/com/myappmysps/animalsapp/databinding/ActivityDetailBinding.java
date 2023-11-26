// Generated by view binder compiler. Do not edit!
package com.myappmysps.animalsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.myappmysps.animalsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageViewDetail;

  @NonNull
  public final TextView textViewDescriptions;

  @NonNull
  public final TextView textViewNameDetail;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageViewDetail, @NonNull TextView textViewDescriptions,
      @NonNull TextView textViewNameDetail) {
    this.rootView = rootView;
    this.imageViewDetail = imageViewDetail;
    this.textViewDescriptions = textViewDescriptions;
    this.textViewNameDetail = textViewNameDetail;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewDetail;
      ImageView imageViewDetail = ViewBindings.findChildViewById(rootView, id);
      if (imageViewDetail == null) {
        break missingId;
      }

      id = R.id.textViewDescriptions;
      TextView textViewDescriptions = ViewBindings.findChildViewById(rootView, id);
      if (textViewDescriptions == null) {
        break missingId;
      }

      id = R.id.textViewNameDetail;
      TextView textViewNameDetail = ViewBindings.findChildViewById(rootView, id);
      if (textViewNameDetail == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, imageViewDetail,
          textViewDescriptions, textViewNameDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
