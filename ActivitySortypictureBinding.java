// Generated by view binder compiler. Do not edit!
package com.s22010198.eco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.s22010198.eco.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySortypictureBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonCapture;

  @NonNull
  public final ImageView captured;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final TextView labelTextView;

  private ActivitySortypictureBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonCapture, @NonNull ImageView captured, @NonNull ImageView imageView7,
      @NonNull TextView labelTextView) {
    this.rootView = rootView;
    this.buttonCapture = buttonCapture;
    this.captured = captured;
    this.imageView7 = imageView7;
    this.labelTextView = labelTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySortypictureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySortypictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sortypicture, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySortypictureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonCapture;
      Button buttonCapture = ViewBindings.findChildViewById(rootView, id);
      if (buttonCapture == null) {
        break missingId;
      }

      id = R.id.captured;
      ImageView captured = ViewBindings.findChildViewById(rootView, id);
      if (captured == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.labelTextView;
      TextView labelTextView = ViewBindings.findChildViewById(rootView, id);
      if (labelTextView == null) {
        break missingId;
      }

      return new ActivitySortypictureBinding((ConstraintLayout) rootView, buttonCapture, captured,
          imageView7, labelTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
